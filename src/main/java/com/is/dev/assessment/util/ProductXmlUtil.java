package com.is.dev.assessment.util;

import com.is.dev.assessment.domain.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ProductXmlUtil {

    public static void serializeToXml(List<Product> products) {
        XmlMapper mapper = new XmlMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            mapper.writer().withRootName("products").writeValue(new File("products.xml"), products);
        } catch (IOException ex) {
            System.out.print("Error occured while writing xml");
        }
    }
}
