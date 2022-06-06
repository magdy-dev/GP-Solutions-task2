package com.magdy.main;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;

import static com.magdy.model.FetchDataFrmXML.fetchDataFrmXML;

public class Main {


    public static void main(String[] args) throws Exception {

        String XML = fetchDataFrmXML("guests.xml");
        Transformer t = TransformerFactory.newInstance().newTransformer(new StreamSource(new File("guests1.xsl")));
        t.transform(new StreamSource(new StringReader(XML)), new StreamResult(new File("guests2.xsl")));
    }

}

