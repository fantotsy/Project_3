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
 * <p>Java class for beerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="beerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="�������"/>
 *     &lt;enumeration value="������"/>
 *     &lt;enumeration value="��������"/>
 *     &lt;enumeration value="�����"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "beerType", namespace = "http://www.example.org/SimpleTypes")
@XmlEnum
public enum BeerType {

    @XmlEnumValue("\u0441\u0432\u0435\u0442\u043b\u043e\u0435")
    �������("\u0441\u0432\u0435\u0442\u043b\u043e\u0435"),
    @XmlEnumValue("\u0442\u0435\u043c\u043d\u043e\u0435")
    ������("\u0442\u0435\u043c\u043d\u043e\u0435"),
    @XmlEnumValue("\u043b\u0430\u0433\u0435\u0440\u043d\u043e\u0435")
    ��������("\u043b\u0430\u0433\u0435\u0440\u043d\u043e\u0435"),
    @XmlEnumValue("\u0436\u0438\u0432\u043e\u0435")
    �����("\u0436\u0438\u0432\u043e\u0435");
    private final String value;

    BeerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BeerType fromValue(String v) {
        for (BeerType c: BeerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
