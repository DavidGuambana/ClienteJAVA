package Test;

import java.util.ArrayList;
import ws.Producto;
import ws.WSOperaciones;
import ws.WSOperaciones_Service;

public class TestWS {
    
    public static WSOperaciones cliente;
    
    public static void main(String[] args) {
        //crear cliente:
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        cliente = servicio.getWSOperacionesPort();
        
        //usar metodos:
        iniciarSesion();
        listarProductos();
        crearProducto();
    }
    
    public static void listarProductos(){
        ArrayList<Producto> productos = (ArrayList<Producto>) cliente.getProductosByClaveValor("proveedor", "Titan");
        if(!productos.isEmpty()){
            for(Producto producto: productos){
                System.out.println("-> "+producto);
            }
        } else{
            System.out.println("Productos no encontrados");
        }
    }
    
    public static void crearProducto(){
        if(cliente.setProducto(11, "Lechuga", 0.20, 20, "Verduras", "Titan")){
            System.out.println("producto creado correctamente!");
        }
    }
    
    public static void iniciarSesion(){
        boolean autenticado = cliente.login("david777", "1234");
        if(autenticado){
            System.out.println("usuario autentucado");
        } else{
            System.out.println("credenciales incorrectas");
        }
    }
}
