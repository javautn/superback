//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.13 at 12:04:41 PM ART 
//


package com.everis.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TablaReferencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TablaReferencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdTabRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TabRefDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TablaReferencia", propOrder = {
    "idTabRef",
    "tabRefDesc",
    "webMethod"
})
public class TablaReferencia {

    @XmlElement(name = "IdTabRef")
    protected String idTabRef;
    @XmlElement(name = "TabRefDesc")
    protected String tabRefDesc;
    @XmlElement(name = "WebMethod")
    protected String webMethod;

    /**
     * Gets the value of the idTabRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTabRef() {
        return idTabRef;
    }

    /**
     * Sets the value of the idTabRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTabRef(String value) {
        this.idTabRef = value;
    }

    /**
     * Gets the value of the tabRefDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabRefDesc() {
        return tabRefDesc;
    }

    /**
     * Sets the value of the tabRefDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabRefDesc(String value) {
        this.tabRefDesc = value;
    }

    /**
     * Gets the value of the webMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebMethod() {
        return webMethod;
    }

    /**
     * Sets the value of the webMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebMethod(String value) {
        this.webMethod = value;
    }

}