
package org.me.multiplicator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.multiplicator package. 
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

    private final static QName _MultiplicateResponse_QNAME = new QName("http://multiplicator.me.org/", "multiplicateResponse");
    private final static QName _Multiplicate_QNAME = new QName("http://multiplicator.me.org/", "multiplicate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.multiplicator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultiplicateResponse }
     * 
     */
    public MultiplicateResponse createMultiplicateResponse() {
        return new MultiplicateResponse();
    }

    /**
     * Create an instance of {@link Multiplicate }
     * 
     */
    public Multiplicate createMultiplicate() {
        return new Multiplicate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://multiplicator.me.org/", name = "multiplicateResponse")
    public JAXBElement<MultiplicateResponse> createMultiplicateResponse(MultiplicateResponse value) {
        return new JAXBElement<MultiplicateResponse>(_MultiplicateResponse_QNAME, MultiplicateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://multiplicator.me.org/", name = "multiplicate")
    public JAXBElement<Multiplicate> createMultiplicate(Multiplicate value) {
        return new JAXBElement<Multiplicate>(_Multiplicate_QNAME, Multiplicate.class, null, value);
    }

}
