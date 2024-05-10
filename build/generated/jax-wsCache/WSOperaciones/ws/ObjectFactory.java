
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCuenta_QNAME = new QName("http://ws/", "addCuenta");
    private final static QName _AddCuentaResponse_QNAME = new QName("http://ws/", "addCuentaResponse");
    private final static QName _GetCuenta_QNAME = new QName("http://ws/", "getCuenta");
    private final static QName _GetCuentaResponse_QNAME = new QName("http://ws/", "getCuentaResponse");
    private final static QName _UpdateUsuario_QNAME = new QName("http://ws/", "updateUsuario");
    private final static QName _UpdateUsuarioResponse_QNAME = new QName("http://ws/", "updateUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCuenta }
     * 
     */
    public AddCuenta createAddCuenta() {
        return new AddCuenta();
    }

    /**
     * Create an instance of {@link AddCuentaResponse }
     * 
     */
    public AddCuentaResponse createAddCuentaResponse() {
        return new AddCuentaResponse();
    }

    /**
     * Create an instance of {@link GetCuenta }
     * 
     */
    public GetCuenta createGetCuenta() {
        return new GetCuenta();
    }

    /**
     * Create an instance of {@link GetCuentaResponse }
     * 
     */
    public GetCuentaResponse createGetCuentaResponse() {
        return new GetCuentaResponse();
    }

    /**
     * Create an instance of {@link UpdateUsuario }
     * 
     */
    public UpdateUsuario createUpdateUsuario() {
        return new UpdateUsuario();
    }

    /**
     * Create an instance of {@link UpdateUsuarioResponse }
     * 
     */
    public UpdateUsuarioResponse createUpdateUsuarioResponse() {
        return new UpdateUsuarioResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addCuenta")
    public JAXBElement<AddCuenta> createAddCuenta(AddCuenta value) {
        return new JAXBElement<AddCuenta>(_AddCuenta_QNAME, AddCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addCuentaResponse")
    public JAXBElement<AddCuentaResponse> createAddCuentaResponse(AddCuentaResponse value) {
        return new JAXBElement<AddCuentaResponse>(_AddCuentaResponse_QNAME, AddCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCuenta")
    public JAXBElement<GetCuenta> createGetCuenta(GetCuenta value) {
        return new JAXBElement<GetCuenta>(_GetCuenta_QNAME, GetCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCuentaResponse")
    public JAXBElement<GetCuentaResponse> createGetCuentaResponse(GetCuentaResponse value) {
        return new JAXBElement<GetCuentaResponse>(_GetCuentaResponse_QNAME, GetCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateUsuario")
    public JAXBElement<UpdateUsuario> createUpdateUsuario(UpdateUsuario value) {
        return new JAXBElement<UpdateUsuario>(_UpdateUsuario_QNAME, UpdateUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateUsuarioResponse")
    public JAXBElement<UpdateUsuarioResponse> createUpdateUsuarioResponse(UpdateUsuarioResponse value) {
        return new JAXBElement<UpdateUsuarioResponse>(_UpdateUsuarioResponse_QNAME, UpdateUsuarioResponse.class, null, value);
    }

}
