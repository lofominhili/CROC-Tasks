package com.company.Task18;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static boolean menu(String order, Connection con) throws SQLException {
        DAO dao = new DAO(con);
        String[] arr = order.split(" ");
        if (Objects.equals(arr[0], "ТОВАР")) {
            dao.createProduct(new Product(arr[1], arr[2], Integer.parseInt(arr[3])));
            return true;
        }
        if (Objects.equals(arr[0], "ИЗМЕНИТЬ")) {
            dao.updateProduct(new Product(arr[1], arr[2], Integer.parseInt(arr[3])));
            return true;
        }
        if (Objects.equals(arr[0], "УДАЛИТЬ")) {
            dao.deleteProduct(arr[1]);
            return true;
        }
        if (Objects.equals(arr[0], "ЗАКАЗ")) {
            List<Product> products = new ArrayList<>();
            for (int i = 3; i < arr.length; i++) {
                dao.findProduct(arr[i]);
                products.add(dao.findProduct(arr[i]));
            }
            dao.createOrder(Integer.parseInt(arr[1]), arr[2], products);
            return true;
        }
        if (Objects.equals(arr[0], "КОНЕЦ")) return false;
        return true;
    }

    public static void main(String[] args) throws SQLException, IOException {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MVideo", "base", "2002");
        boolean check = true;
        Scanner in = new Scanner(System.in);
        while (check) {
            System.out.println("Введите что хотите сделать:");
            String input = in.nextLine();
            check = menu(input, con);
        }
        in.close();
        con.close();
    }
}
