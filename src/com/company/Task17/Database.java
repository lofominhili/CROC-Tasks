package com.company.Task17;

public class Database {
    private int orderNumber;
    private String login;
    private String articleCode;
    private String productName;
    private int price;

    public Database(int orderNumber, String login, String articleCode, String productName, int price) {
        this.orderNumber = orderNumber;
        this.login = login;
        this.articleCode = articleCode;
        this.productName = productName;
        this.price = price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getLogin() {
        return login;
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

    public static Database parse(String str) {
        String[] arr = str.split(",");
        int orderNumber = Integer.parseInt(arr[0]);
        String login = arr[1];
        String articleCode = arr[2];
        String productName = arr[3];
        int price = Integer.parseInt(arr[4]);
        return new Database(orderNumber, login, articleCode, productName, price);
    }
}