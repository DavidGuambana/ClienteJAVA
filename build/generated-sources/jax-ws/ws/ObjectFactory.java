
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

    private final static QName _Login_QNAME = new QName("http://ws/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://ws/", "LoginResponse");
    private final static QName _GetProductosByClaveValor_QNAME = new QName("http://ws/", "getProductosByClaveValor");
    private final static QName _GetProductosByClaveValorResponse_QNAME = new QName("http://ws/", "getProductosByClaveValorResponse");
    private final static QName _SetProducto_QNAME = new QName("http://ws/", "setProducto");
    private final static QName _SetProductoResponse_QNAME = new QName("http://ws/", "setProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetProductosByClaveValor }
     * 
     */
    public GetProductosByClaveValor createGetProductosByClaveValor() {
        return new GetProductosByClaveValor();
    }

    /**
     * Create an instance of {@link GetProductosByClaveValorResponse }
     * 
     */
    public GetProductosByClaveValorResponse createGetProductosByClaveValorResponse() {
        return new GetProductosByClaveValorResponse();
    }

    /**
     * Create an instance of {@link SetProducto }
     * 
     */
    public SetProducto createSetProducto() {
        return new SetProducto();
    }

    /**
     * Create an instance of {@link SetProductoResponse }
     * 
     */
    public SetProductoResponse createSetProductoResponse() {
        return new SetProductoResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductosByClaveValor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getProductosByClaveValor")
    public JAXBElement<GetProductosByClaveValor> createGetProductosByClaveValor(GetProductosByClaveValor value) {
        return new JAXBElement<GetProductosByClaveValor>(_GetProductosByClaveValor_QNAME, GetProductosByClaveValor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductosByClaveValorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getProductosByClaveValorResponse")
    public JAXBElement<GetProductosByClaveValorResponse> createGetProductosByClaveValorResponse(GetProductosByClaveValorResponse value) {
        return new JAXBElement<GetProductosByClaveValorResponse>(_GetProductosByClaveValorResponse_QNAME, GetProductosByClaveValorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "setProducto")
    public JAXBElement<SetProducto> createSetProducto(SetProducto value) {
        return new JAXBElement<SetProducto>(_SetProducto_QNAME, SetProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "setProductoResponse")
    public JAXBElement<SetProductoResponse> createSetProductoResponse(SetProductoResponse value) {
        return new JAXBElement<SetProductoResponse>(_SetProductoResponse_QNAME, SetProductoResponse.class, null, value);
    }

}
