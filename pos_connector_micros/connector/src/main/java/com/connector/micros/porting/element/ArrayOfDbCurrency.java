package com.connector.micros.porting.element;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.util.List;


@SuppressWarnings({"unchecked", "unused"})
@XmlRootElement(name = "ArrayOfDbCurrency")
public class ArrayOfDbCurrency {


    private List<DbCurrency> dbCurrencies;


    public ArrayOfDbCurrency() {
    }

    public ArrayOfDbCurrency(List<DbCurrency> dbCurrencies) {
        super();
        this.dbCurrencies = dbCurrencies;
    }

    @XmlElement(name = "DbCurrency")
    public List<DbCurrency> getDbCurrencies() {
        return dbCurrencies;
    }

    public void setDbCurrencies(List<DbCurrency> dbCurrencies) {
        this.dbCurrencies = dbCurrencies;
    }

    public static class Factory {

        public static ArrayOfDbCurrency parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(ArrayOfDbCurrency.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            ArrayOfDbCurrency object = (ArrayOfDbCurrency) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}
