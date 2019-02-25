package com.is.dev.assessment;

import com.is.dev.assessment.util.*;
import com.is.dev.assessment.domain.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Product> csvProducts = ProductCsvUtil.ProcessFile();
        List<Product> tsvProducts = ProductTsvUtil.ProcessFile();
        
        List<Product> products = getUniqueProducts(csvProducts, tsvProducts);
        
        ProductXmlUtil.serializeToXml(products);
        ProductJsonUtil.serializeToJson(products);
    }
    
    public static List<Product> getUniqueProducts(List<Product> csvProds, List<Product> tsvProds) {
        
        List<Product> products = new ArrayList<Product>();
        for (Product csv : csvProds) {
            products.add(csv);
        }
        // Add Products from TSV if not already existing
        for (Product tsv : tsvProds) {
            Boolean unique = true;
            for (Product p : csvProds) {
                if (tsv.getSku().equals(p.getSku())) {
                    unique = false;
                }
            }
            if (unique) 
                products.add(tsv);
            
        }
        return products;
    }
}
