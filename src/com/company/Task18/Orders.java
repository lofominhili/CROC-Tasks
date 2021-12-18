package com.company.Task18;

import java.util.List;

public class Orders {
    private final int orderNumber;
    private final String login;
    private final List<Product> product;

    public Orders(int orderNumber, String login, List<Product> product) {
        this.orderNumber = orderNumber;
        this.login = login;
        this.product = product;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getLogin() {
        return login;
    }

}
