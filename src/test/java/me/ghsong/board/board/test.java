package me.ghsong.board.board;
import java.sql.Connection;

import java.sql.DriverManager;
import org.junit.jupiter.api.Test;



public class test {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/MySQL81?useSSL=false&serverTimezone=Asia/Seoul";
    private static final String USER = "big0550";
    private static final String PASSWORD = "1234";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}