package com.company.Task18;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DAO {
    private final Connection con;

    public DAO(Connection con) {
        this.con = con;
    }

    public Product findProduct(String productCode) throws SQLException {
        ResultSet res = con.createStatement().executeQuery(String.format("select * from Products where article_code = '%s'", productCode));
        if (!res.next()) return null;
        else {
            return new Product(res.getString("article_code"), res.getString("product_name"), res.getInt("price"));
        }
    }

    public Product createProduct(Product product) throws SQLException {
        con.createStatement().execute(String.format("insert into Products(article_code, product_name, price) values ('%s','%s',%d)", product.getArticleCode(), product.getProductName(), product.getPrice()));
        return product;
    }

    public Product updateProduct(Product product) throws SQLException {
        Product pro = findProduct(product.getArticleCode());
        if (pro == null) System.err.println("Такого продукт кода не существует!");
        else {
            con.createStatement().execute(String.format("update Products set product_name = '%s', price = %d where article_code = '%s'", product.getProductName(), product.getPrice(), product.getArticleCode()));
            return product;
        }
        return null;
    }

    public void deleteProduct(String productCode) throws SQLException {
        Product product = findProduct(productCode);
        if (product == null) System.err.println("Такого продукт кода не существует!");
        else {
            con.createStatement().execute(String.format("delete from Products where article_code = '%s'", productCode));
            con.createStatement().execute(String.format("delete from Orders where product_article = '%s'", productCode));
        }
    }

    public Orders createOrder(int orderNumber, String userLogin, List<Product> products) throws SQLException {
        for (Product product : products) {
            con.createStatement().execute(String.format("insert into Orders(order_number, login, product_article) values (%d,'%s','%s')", orderNumber, userLogin, product.getArticleCode()));
        }
        return new Orders(orderNumber, userLogin, products);
    }
}
