//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.07 at 12:30:01 PM EEST 
//


package ua.fantotsy.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for materialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="materialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="������"/>
 *     &lt;enumeration value="�������"/>
 *     &lt;enumeration value="�����"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "materialType", namespace = "http://www.example.org/SimpleTypes")
@XmlEnum
public enum MaterialType {

    @XmlEnumValue("\u0441\u0442\u0435\u043a\u043b\u043e")
    ������("\u0441\u0442\u0435\u043a\u043b\u043e"),
    @XmlEnumValue("\u043f\u043b\u0430\u0441\u0442\u0438\u043a")
    �������("\u043f\u043b\u0430\u0441\u0442\u0438\u043a"),
    @XmlEnumValue("\u0431\u0430\u043d\u043a\u0430")
    �����("\u0431\u0430\u043d\u043a\u0430");
    private final String value;

    MaterialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaterialType fromValue(String v) {
        for (MaterialType c: MaterialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}