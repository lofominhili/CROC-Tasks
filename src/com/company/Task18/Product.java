package com.company.Task18;

public class Product {
    private final String articleCode;
    private final String productName;
    private final int price;

    public Product(String articleCode, String productName, int price) {
        this.articleCode = articleCode;
        this.productName = productName;
        this.price = price;
    }

    public String getArticleCode() {
        return articleCode;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

}
