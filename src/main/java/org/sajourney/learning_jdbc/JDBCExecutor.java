package org.sajourney.learning_jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JDBCExecutor {
    public static void main(String[] args){
        System.out.println("Hello Learning JDBC");
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "hplussport", "postgres", "12345");
        try{
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);
            customerDAO.findAllSorted(20).forEach(System.out::println);


        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
