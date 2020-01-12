package com.connector.micros.porting.element;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.util.List;


@SuppressWarnings({"unchecked", "unused"})
@XmlRootElement(name = "ArrayOfDbTenderMedia")
public class ArrayOfDbTenderMedia {


    private List<DbTenderMedia> dbTenderMediaList;


    public ArrayOfDbTenderMedia() {
    }

    public ArrayOfDbTenderMedia(List<DbTenderMedia> dbTenderMediaList) {
        super();
        this.dbTenderMediaList = dbTenderMediaList;
    }

    @XmlElement(name = "DbTenderMedia")
    public List<DbTenderMedia> getDbTenderMedia() {
        return dbTenderMediaList;
    }

    public void setDbTenderMedia(List<DbTenderMedia> dbTenderMediaList) {
        this.dbTenderMediaList = dbTenderMediaList;
    }

    public static class Factory {

        public static ArrayOfDbTenderMedia parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(ArrayOfDbTenderMedia.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            ArrayOfDbTenderMedia object = (ArrayOfDbTenderMedia) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}
