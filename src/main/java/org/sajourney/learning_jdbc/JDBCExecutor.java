package org.sajourney.learning_jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExecutor {
    public static void main(String[] args){
        System.out.println("Hello Learning JDBC");
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "hplussport", "postgres", "12345");
        try{
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = customerDAO.findById(1000);
            System.out.println(customer.getFirstName() + " " + customer.getLastName());

            customerDAO.create(customer);


        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
