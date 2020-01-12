package com.connector.micros.porting.element;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.util.List;


@SuppressWarnings({"unchecked", "unused"})
@XmlRootElement(name = "ArrayOfDbMenuItemDefinition")
public class ArrayOfDbMenuItemDefinition {


    private List<DbMenuItemDefinition> dbMenuItemDefinition;


    public ArrayOfDbMenuItemDefinition() {
    }

    public ArrayOfDbMenuItemDefinition(List<DbMenuItemDefinition> dbMenuItemDefinition) {
        super();
        this.dbMenuItemDefinition = dbMenuItemDefinition;
    }


    @XmlElement(name = "DbMenuItemDefinition")
    public List<DbMenuItemDefinition> getDbMenuItemDefinition() {
        return dbMenuItemDefinition;
    }

    public void setDbMenuItemDefinition(List<DbMenuItemDefinition> dbMenuItemDefinition) {
        this.dbMenuItemDefinition = dbMenuItemDefinition;
    }

    public static class Factory {

        public static ArrayOfDbMenuItemDefinition parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(ArrayOfDbMenuItemDefinition.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);

            ArrayOfDbMenuItemDefinition object = (ArrayOfDbMenuItemDefinition) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}
