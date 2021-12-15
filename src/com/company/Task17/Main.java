package com.company.Task17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MVideo", "base", "2002");
        con.createStatement().execute("create table Products(article_code character varying primary key, product_name character varying not null, price numeric not null)");
        con.createStatement().execute("create table Orders(order_number numeric not null, login character varying(10) not null, product_article character varying not null references Products(article_code))");
        BufferedReader bf = new BufferedReader(new FileReader(args[0]));
        String str = bf.readLine();
        while (str != null) {
            Database base = Database.parse(str);
            ResultSet res = con.createStatement().executeQuery(String.format("select article_code from Products where article_code = '%s'", base.getArticleCode()));
            if (!res.next())
                con.createStatement().execute(String.format("insert into Products(article_code, product_name, price) values ('%s','%s',%d)", base.getArticleCode(), base.getProductName(), base.getPrice()));
            con.createStatement().execute(String.format("insert into Orders(order_number, login, product_article) values (%d,'%s','%s')", base.getOrderNumber(), base.getLogin(), base.getArticleCode()));
            str = bf.readLine();
        }
        bf.close();
        con.close();
    }
}
