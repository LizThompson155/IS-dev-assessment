package com.is.dev.assessment.util;

import com.is.dev.assessment.domain.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ProductJsonUtil {

    public static void serializeToJson(List<Product> products) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("products.json"), products);
        } catch (IOException ex) {
            System.out.print("Error occured while writing Json");
        }
    }
}
