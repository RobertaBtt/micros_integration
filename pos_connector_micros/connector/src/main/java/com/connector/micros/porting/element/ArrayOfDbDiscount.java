package com.connector.micros.porting.element;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.util.List;


@SuppressWarnings({"unchecked", "unused"})
@XmlRootElement(name = "ArrayOfDbDiscount")
public class ArrayOfDbDiscount {


    private List<DbDiscount> dbDiscounts;


    public ArrayOfDbDiscount() {
    }

    public ArrayOfDbDiscount(List<DbDiscount> dbDiscounts) {
        super();
        this.dbDiscounts = dbDiscounts;
    }

    @XmlElement(name = "DbDiscount")
    public List<DbDiscount> getDbDiscounts() {
        return dbDiscounts;
    }

    public void setDbDiscounts(List<DbDiscount> dbDiscounts) {
        this.dbDiscounts = dbDiscounts;
    }

    public static class Factory {

        public static ArrayOfDbDiscount parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(ArrayOfDbDiscount.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            ArrayOfDbDiscount object = (ArrayOfDbDiscount) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}
