package com.connector.micros.porting.element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.util.List;

@XmlRootElement(name = "DetailLines")
public class DetailLines {

    private List<DetailLine> detailLines;

    public DetailLines() {
    }

    public DetailLines(List<DetailLine> detailLine) {
        super();
        this.detailLines = detailLine;
    }

    /***
     * @doc The "get" method must follow the name of the Tag *
     * */
    @XmlElement(name = "DetailLine")
    public List<DetailLine> getDetailLine() {
        return detailLines;
    }


    public void setDetailLine(List<DetailLine> detailLine) {
        this.detailLines = detailLine;
    }

    public static class Factory {

        public static DetailLines parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(DetailLines.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            DetailLines object = (DetailLines) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}

