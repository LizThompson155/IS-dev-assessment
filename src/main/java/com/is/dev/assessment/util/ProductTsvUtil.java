package com.is.dev.assessment.util;
import com.is.dev.assessment.domain.Product;

import java.io.FileReader;
import java.util.List;
import com.opencsv.bean.CsvToBeanBuilder;


public class ProductTsvUtil {

    public static List<Product> ProcessFile() {
        List<Product> products = null;
        try {
            products = new CsvToBeanBuilder<Product>(new FileReader("products.tsv"))
                    .withType(Product.class)
                    .withSeparator('\t')
                    .withIgnoreQuotations(false)
                    .build()
                    .parse();
        } catch (Exception e) {
            System.out.println("Error occured processing tsv file");
        }
        return products;
    }
}
