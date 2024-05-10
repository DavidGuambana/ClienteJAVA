
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSOperaciones", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSOperaciones {


    /**
     * 
     * @param clave
     * @param usuario
     * @return
     *     returns ws.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCuenta", targetNamespace = "http://ws/", className = "ws.GetCuenta")
    @ResponseWrapper(localName = "getCuentaResponse", targetNamespace = "http://ws/", className = "ws.GetCuentaResponse")
    @Action(input = "http://ws/WSOperaciones/getCuentaRequest", output = "http://ws/WSOperaciones/getCuentaResponse")
    public Usuario getCuenta(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "clave", targetNamespace = "")
        String clave);

    /**
     * 
     * @param usuario
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateUsuario", targetNamespace = "http://ws/", className = "ws.UpdateUsuario")
    @ResponseWrapper(localName = "updateUsuarioResponse", targetNamespace = "http://ws/", className = "ws.UpdateUsuarioResponse")
    @Action(input = "http://ws/WSOperaciones/updateUsuarioRequest", output = "http://ws/WSOperaciones/updateUsuarioResponse")
    public boolean updateUsuario(
        @WebParam(name = "Usuario", targetNamespace = "")
        Usuario usuario);

    /**
     * 
     * @param usuario
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCuenta", targetNamespace = "http://ws/", className = "ws.AddCuenta")
    @ResponseWrapper(localName = "addCuentaResponse", targetNamespace = "http://ws/", className = "ws.AddCuentaResponse")
    @Action(input = "http://ws/WSOperaciones/addCuentaRequest", output = "http://ws/WSOperaciones/addCuentaResponse")
    public Boolean addCuenta(
        @WebParam(name = "Usuario", targetNamespace = "")
        Usuario usuario);

}
