//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.02 um 08:45:03 PM CET 
//


package dcpDescription;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dcpVariableType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dcpVariableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Int8" type="{}dcpInteger8Type"/>
 *           &lt;element name="Int16" type="{}dcpInteger16Type"/>
 *           &lt;element name="Int32" type="{}dcpInteger32Type"/>
 *           &lt;element name="Int64" type="{}dcpInteger64Type"/>
 *           &lt;element name="Uint8" type="{}dcpUnsignedInteger8Type"/>
 *           &lt;element name="Uint16" type="{}dcpUnsignedInteger16Type"/>
 *           &lt;element name="Uint32" type="{}dcpUnsignedInteger32Type"/>
 *           &lt;element name="Uint64" type="{}dcpUnsignedInteger64Type"/>
 *           &lt;element name="Float32" type="{}dcpFloat32Type"/>
 *           &lt;element name="Float64" type="{}dcpFloat64Type"/>
 *           &lt;element name="String" type="{}dcpStringType"/>
 *           &lt;element name="Binary" type="{}dcpBinaryType"/>
 *         &lt;/choice>
 *         &lt;element name="Dimensions" type="{}dcpDimensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dcpVariableType", propOrder = {
    "int8",
    "int16",
    "int32",
    "int64",
    "uint8",
    "uint16",
    "uint32",
    "uint64",
    "float32",
    "float64",
    "string",
    "binary",
    "dimensions"
})
public class DcpVariableType {

    @XmlElement(name = "Int8")
    protected DcpInteger8Type int8;
    @XmlElement(name = "Int16")
    protected DcpInteger16Type int16;
    @XmlElement(name = "Int32")
    protected DcpInteger32Type int32;
    @XmlElement(name = "Int64")
    protected DcpInteger64Type int64;
    @XmlElement(name = "Uint8")
    protected DcpUnsignedInteger8Type uint8;
    @XmlElement(name = "Uint16")
    protected DcpUnsignedInteger16Type uint16;
    @XmlElement(name = "Uint32")
    protected DcpUnsignedInteger32Type uint32;
    @XmlElement(name = "Uint64")
    protected DcpUnsignedInteger64Type uint64;
    @XmlElement(name = "Float32")
    protected DcpFloat32Type float32;
    @XmlElement(name = "Float64")
    protected DcpFloat64Type float64;
    @XmlElement(name = "String")
    protected DcpStringType string;
    @XmlElement(name = "Binary")
    protected DcpBinaryType binary;
    @XmlElement(name = "Dimensions")
    protected DcpDimensionsType dimensions;

    /**
     * Ruft den Wert der int8-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpInteger8Type }
     *     
     */
    public DcpInteger8Type getInt8() {
        return int8;
    }

    /**
     * Legt den Wert der int8-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpInteger8Type }
     *     
     */
    public void setInt8(DcpInteger8Type value) {
        this.int8 = value;
    }

    /**
     * Ruft den Wert der int16-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpInteger16Type }
     *     
     */
    public DcpInteger16Type getInt16() {
        return int16;
    }

    /**
     * Legt den Wert der int16-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpInteger16Type }
     *     
     */
    public void setInt16(DcpInteger16Type value) {
        this.int16 = value;
    }

    /**
     * Ruft den Wert der int32-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpInteger32Type }
     *     
     */
    public DcpInteger32Type getInt32() {
        return int32;
    }

    /**
     * Legt den Wert der int32-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpInteger32Type }
     *     
     */
    public void setInt32(DcpInteger32Type value) {
        this.int32 = value;
    }

    /**
     * Ruft den Wert der int64-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpInteger64Type }
     *     
     */
    public DcpInteger64Type getInt64() {
        return int64;
    }

    /**
     * Legt den Wert der int64-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpInteger64Type }
     *     
     */
    public void setInt64(DcpInteger64Type value) {
        this.int64 = value;
    }

    /**
     * Ruft den Wert der uint8-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpUnsignedInteger8Type }
     *     
     */
    public DcpUnsignedInteger8Type getUint8() {
        return uint8;
    }

    /**
     * Legt den Wert der uint8-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpUnsignedInteger8Type }
     *     
     */
    public void setUint8(DcpUnsignedInteger8Type value) {
        this.uint8 = value;
    }

    /**
     * Ruft den Wert der uint16-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpUnsignedInteger16Type }
     *     
     */
    public DcpUnsignedInteger16Type getUint16() {
        return uint16;
    }

    /**
     * Legt den Wert der uint16-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpUnsignedInteger16Type }
     *     
     */
    public void setUint16(DcpUnsignedInteger16Type value) {
        this.uint16 = value;
    }

    /**
     * Ruft den Wert der uint32-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpUnsignedInteger32Type }
     *     
     */
    public DcpUnsignedInteger32Type getUint32() {
        return uint32;
    }

    /**
     * Legt den Wert der uint32-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpUnsignedInteger32Type }
     *     
     */
    public void setUint32(DcpUnsignedInteger32Type value) {
        this.uint32 = value;
    }

    /**
     * Ruft den Wert der uint64-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpUnsignedInteger64Type }
     *     
     */
    public DcpUnsignedInteger64Type getUint64() {
        return uint64;
    }

    /**
     * Legt den Wert der uint64-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpUnsignedInteger64Type }
     *     
     */
    public void setUint64(DcpUnsignedInteger64Type value) {
        this.uint64 = value;
    }

    /**
     * Ruft den Wert der float32-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpFloat32Type }
     *     
     */
    public DcpFloat32Type getFloat32() {
        return float32;
    }

    /**
     * Legt den Wert der float32-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpFloat32Type }
     *     
     */
    public void setFloat32(DcpFloat32Type value) {
        this.float32 = value;
    }

    /**
     * Ruft den Wert der float64-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpFloat64Type }
     *     
     */
    public DcpFloat64Type getFloat64() {
        return float64;
    }

    /**
     * Legt den Wert der float64-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpFloat64Type }
     *     
     */
    public void setFloat64(DcpFloat64Type value) {
        this.float64 = value;
    }

    /**
     * Ruft den Wert der string-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpStringType }
     *     
     */
    public DcpStringType getString() {
        return string;
    }

    /**
     * Legt den Wert der string-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpStringType }
     *     
     */
    public void setString(DcpStringType value) {
        this.string = value;
    }

    /**
     * Ruft den Wert der binary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpBinaryType }
     *     
     */
    public DcpBinaryType getBinary() {
        return binary;
    }

    /**
     * Legt den Wert der binary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpBinaryType }
     *     
     */
    public void setBinary(DcpBinaryType value) {
        this.binary = value;
    }

    /**
     * Ruft den Wert der dimensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpDimensionsType }
     *     
     */
    public DcpDimensionsType getDimensions() {
        return dimensions;
    }

    /**
     * Legt den Wert der dimensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpDimensionsType }
     *     
     */
    public void setDimensions(DcpDimensionsType value) {
        this.dimensions = value;
    }

}
