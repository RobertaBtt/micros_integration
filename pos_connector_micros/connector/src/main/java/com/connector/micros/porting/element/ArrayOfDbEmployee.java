package com.connector.micros.porting.element;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.util.List;


@SuppressWarnings({"unchecked", "unused"})
@XmlRootElement(name = "ArrayOfDbEmployee")
public class ArrayOfDbEmployee {


    private List<DbEmployee> dbEmployee;


    public ArrayOfDbEmployee() {
    }

    public ArrayOfDbEmployee(List<DbEmployee> dbEmployee) {
        super();
        this.dbEmployee = dbEmployee;
    }

    @XmlElement(name = "DbEmployee")
    public List<DbEmployee> getDbEmployee() {
        return dbEmployee;
    }

    public void setDbEmployee(List<DbEmployee> dbEmployee) {
        this.dbEmployee = dbEmployee;
    }

    public static class Factory {

        public static ArrayOfDbEmployee parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(ArrayOfDbEmployee.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            ArrayOfDbEmployee object = (ArrayOfDbEmployee) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}
