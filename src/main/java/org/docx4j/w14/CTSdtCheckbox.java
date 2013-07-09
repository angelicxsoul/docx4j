/*
 *  Copyright 2013, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.w14;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.docx4j.wml.Child;


/**
 * <p>Java class for CT_SdtCheckbox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_SdtCheckbox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checked" type="{http://schemas.microsoft.com/office/word/2010/wordml}CT_OnOff" minOccurs="0"/>
 *         &lt;element name="checkedState" type="{http://schemas.microsoft.com/office/word/2010/wordml}CT_SdtCheckboxSymbol" minOccurs="0"/>
 *         &lt;element name="uncheckedState" type="{http://schemas.microsoft.com/office/word/2010/wordml}CT_SdtCheckboxSymbol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_SdtCheckbox", propOrder = {
    "checked",
    "checkedState",
    "uncheckedState"
})
public class CTSdtCheckbox implements Child
{

    protected CTOnOff checked;
    protected CTSdtCheckboxSymbol checkedState;
    protected CTSdtCheckboxSymbol uncheckedState;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the checked property.
     * 
     * @return
     *     possible object is
     *     {@link CTOnOff }
     *     
     */
    public CTOnOff getChecked() {
        return checked;
    }

    /**
     * Sets the value of the checked property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOnOff }
     *     
     */
    public void setChecked(CTOnOff value) {
        this.checked = value;
    }

    /**
     * Gets the value of the checkedState property.
     * 
     * @return
     *     possible object is
     *     {@link CTSdtCheckboxSymbol }
     *     
     */
    public CTSdtCheckboxSymbol getCheckedState() {
        return checkedState;
    }

    /**
     * Sets the value of the checkedState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSdtCheckboxSymbol }
     *     
     */
    public void setCheckedState(CTSdtCheckboxSymbol value) {
        this.checkedState = value;
    }

    /**
     * Gets the value of the uncheckedState property.
     * 
     * @return
     *     possible object is
     *     {@link CTSdtCheckboxSymbol }
     *     
     */
    public CTSdtCheckboxSymbol getUncheckedState() {
        return uncheckedState;
    }

    /**
     * Sets the value of the uncheckedState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSdtCheckboxSymbol }
     *     
     */
    public void setUncheckedState(CTSdtCheckboxSymbol value) {
        this.uncheckedState = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}
