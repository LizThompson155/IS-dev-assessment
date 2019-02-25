package com.is.dev.assessment.domain;
import com.opencsv.bean.CsvBindByName;


public class Product {

    @CsvBindByName(column = "title")
    private String title;
    @CsvBindByName(column = "upc")
    private String upc;
    @CsvBindByName(column = "sku")
    private String sku;
    @CsvBindByName(column = "price")
    private Double price;
    @CsvBindByName(column = "condition")
    private String condition;
    @CsvBindByName(column = "quantity")
    private Integer quantity;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}