package controlador;

import java.awt.Color;
import javax.swing.JOptionPane;
import vistas.vCuenta;
import vistas.vLogin;
import vistas.vRegistro;
import ws.Usuario;
import ws.WSOperaciones;
import ws.WSOperaciones_Service;

public class TestWS {

    public static WSOperaciones cliente;
    public static vLogin vL;
    public static vRegistro vR;
    public static vCuenta vC;
    public static Usuario session_usuario;

    public static void main(String[] args) {
        if (conectar()) {
            abrirLogin();
        }
    }

    public static boolean conectar() {
        try {
            WSOperaciones_Service servicio = new WSOperaciones_Service();
            cliente = servicio.getWSOperacionesPort();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar al servidor", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static void iniciarSesion() {
        session_usuario = cliente.getCuenta(vL.getTxtUsuario().getText(), vL.getTxtClave().getText());
        if (session_usuario != null) {
            abrirCuenta(session_usuario);
        } else {
            vL.getLbMsgLogin().setVisible(true);
        }
    }

    public static void cerrarSesion() {
        vC.dispose();
        abrirLogin();
    }

    public static void registrar() {
        String xusuario = vR.getTxtUsuario().getText();
        String xclave1 = vR.getTxtClave().getText();
        String xclave2 = vR.getTxtClaveConfirmada().getText();

        if (!xusuario.isEmpty() && !xclave1.isEmpty() && !xclave2.isEmpty()) {

            if (xclave1.equals(xclave2)) {
                Usuario usuario = new Usuario();
                usuario.setUsuario(xusuario);
                usuario.setClave(xclave2);
                usuario.setDinero(0.0);
                if (cliente.addCuenta(usuario)) {
                    vR.dispose();
                    abrirLogin();
                    JOptionPane.showMessageDialog(null, "Cuenta creada correctamente");
                }
            } else {
                vR.getLblMsgRegistro().setText("Las claves no coinciden");
                vR.getLblMsgRegistro().setVisible(true);
            }

        } else {
            vR.getLblMsgRegistro().setText("No se permiten campos vacios");
            vR.getLblMsgRegistro().setVisible(true);
        }

    }

    public static void abrirCuenta(Usuario usuario) {
        vL.dispose();
        vC = new vCuenta();
        vC.setLocationRelativeTo(null);
        vC.getLbMsgCuenta().setVisible(false);
        //Llenar datos:
        vC.getLbUsuario().setText("Cuenta de usuario: " + usuario.getUsuario());
        vC.getLbSaldo().setText("Saldo : $" + usuario.getDinero());
        vC.getBtnOK().setVisible( false);
        vC.setVisible(true);
        vC.getBtnSalir().addActionListener(l -> cerrarSesion());
        vC.getBtnOK().addActionListener(l -> OK());
        vC.getJrbDepositar().addActionListener(l -> {
            vC.getBtnOK().setText("Depositar");
            vC.getBtnOK().setVisible(true);

        });
        vC.getJrbRetirar().addActionListener(l -> {
            vC.getBtnOK().setText("Retirar");
            vC.getBtnOK().setVisible(true);

        });
    }

    public static void OK() {
        try {
            Double monto = Double.valueOf(vC.getTxtMonto().getText());
            if (monto >= 10.00) {
                if (vC.getJrbDepositar().isSelected()) {
                    //DEPOSITAR:
                    session_usuario.setDinero(session_usuario.getDinero() + monto);
                    if (cliente.updateUsuario(session_usuario)) {
                        vC.getLbMsgCuenta().setForeground(Color.green);
                        vC.getLbMsgCuenta().setText("Depósito realizado con éxito");
                        vC.getLbMsgCuenta().setVisible(true);
                        vC.getLbSaldo().setText("Saldo: $" + session_usuario.getDinero());
                    }
                } else {
                    //RETIRAR:
                    if (monto <= session_usuario.getDinero()) {
                        session_usuario.setDinero(session_usuario.getDinero() - monto);
                        if (cliente.updateUsuario(session_usuario)) {
                            vC.getLbMsgCuenta().setForeground(Color.green);
                            vC.getLbMsgCuenta().setText("Retiro realizado con éxito");
                            vC.getLbMsgCuenta().setVisible(true);
                            vC.getLbSaldo().setText("Saldo: $" + session_usuario.getDinero());

                        }
                    } else {
                        vC.getLbMsgCuenta().setText("Saldo insuficiente");
                        vC.getLbMsgCuenta().setVisible(true);
                    }
                }
            } else {
                vC.getLbMsgCuenta().setText("El monto mínimo es: $10.00");
                vC.getLbMsgCuenta().setVisible(true);
            }
        } catch (NumberFormatException ex) {
            if (vC.getTxtMonto().getText().isEmpty()) {
                vC.getLbMsgCuenta().setText("Ingrese un monto, por favor");
            } else {
                vC.getLbMsgCuenta().setText("Ingrese valores correctos (Ejm: 10)");
            }
            vC.getLbMsgCuenta().setVisible(true);
        }
    }

    public static void abrirLogin() {
        vL = new vLogin();
        vL.setLocationRelativeTo(null);
        vL.getLbMsgLogin().setVisible(false);
        vL.setVisible(true);
        vL.getBtnIngresar().addActionListener(l -> iniciarSesion());
        vL.getBtnRegistrar().addActionListener(l -> abrirRegistro());

    }

    public static void abrirRegistro() {
        vL.dispose();
        vR = new vRegistro();
        vR.setLocationRelativeTo(null);
        vR.getLblMsgRegistro().setVisible(false);
        vR.setVisible(true);

        //asignar controles:
        vR.getBtnRegistrar().addActionListener(l -> registrar());
        vR.getBtnLogin().addActionListener(l -> {
            vR.dispose();
            abrirLogin();
        });
    }
}
