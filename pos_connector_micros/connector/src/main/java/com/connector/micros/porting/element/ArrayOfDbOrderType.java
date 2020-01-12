package com.connector.micros.porting.element;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.util.List;


@SuppressWarnings({"unchecked", "unused"})
@XmlRootElement(name = "ArrayOfDbOrderType")
public class ArrayOfDbOrderType {

    private List<DbOrderType> dbOrderType;

    public ArrayOfDbOrderType() {
    }

    public ArrayOfDbOrderType(List<DbOrderType> dbOrderType) {
        super();
        this.dbOrderType = dbOrderType;
    }

    @XmlElement(name = "DbOrderType")
    public List<DbOrderType> getDbOrderType() {
        return dbOrderType;
    }

    public void setDbOrderType(List<DbOrderType> dbOrderType) {
        this.dbOrderType = dbOrderType;
    }

    public static class Factory {

        public static ArrayOfDbOrderType parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(ArrayOfDbOrderType.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            ArrayOfDbOrderType object = (ArrayOfDbOrderType) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}
