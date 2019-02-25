package com.is.dev.assessment.util;

import com.is.dev.assessment.domain.Product;
import java.io.FileReader;
import java.util.List;
import com.opencsv.bean.CsvToBeanBuilder;


public class ProductCsvUtil {

    public static List<Product> ProcessFile() {
        List<Product> products = null;
        try {
            products = new CsvToBeanBuilder<Product>(new FileReader("products.csv"))
                    .withType(Product.class)
                    .withSeparator(',')
                    .withIgnoreQuotations(false)
                    .build()
                    .parse();
        } catch (Exception e) {
            System.out.println("Error occured processing csv file");
        }
        return products;
    }
}
