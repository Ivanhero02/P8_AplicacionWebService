
package clientewsescritorio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Pagar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Pagar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="num_tarjeta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pagar", propOrder = {
    "numTarjeta",
    "monto",
    "nombre",
    "cvv"
})
public class Pagar {

    @XmlElement(name = "num_tarjeta")
    protected int numTarjeta;
    protected int monto;
    protected String nombre;
    protected int cvv;

    /**
     * Obtiene el valor de la propiedad numTarjeta.
     * 
     */
    public int getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Define el valor de la propiedad numTarjeta.
     * 
     */
    public void setNumTarjeta(int value) {
        this.numTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public int getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(int value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad cvv.
     * 
     */
    public int getCvv() {
        return cvv;
    }

    /**
     * Define el valor de la propiedad cvv.
     * 
     */
    public void setCvv(int value) {
        this.cvv = value;
    }

}
