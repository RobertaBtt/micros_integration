package com.connector.micros.porting.element;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.util.List;


@SuppressWarnings({"unchecked", "unused"})
@XmlRootElement(name = "ArrayOfDbMenuItemClass")
public class ArrayOfDbMenuItemClass {


    private List<DbMenuItemClass> DbMenuItemClass;


    public ArrayOfDbMenuItemClass() {
    }

    public ArrayOfDbMenuItemClass(List<DbMenuItemClass> dbMenuItemClass) {
        super();
        this.DbMenuItemClass = dbMenuItemClass;
    }

    @XmlElement(name = "DbMenuItemClass")
    public List<DbMenuItemClass> getDbMenuItemClass() {
        return DbMenuItemClass;
    }

    public void setDbMenuItemClass(List<DbMenuItemClass> DbMenuItemClass) {
        this.DbMenuItemClass = DbMenuItemClass;
    }

    public static class Factory {

        public static ArrayOfDbMenuItemClass parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(ArrayOfDbMenuItemClass.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            ArrayOfDbMenuItemClass object = (ArrayOfDbMenuItemClass) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}
