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
            Customer customer = new Customer();
            customer.setFirstName("George");
            customer.setLastName("Washington");
            customer.setEmail("george@gmail.com");
            customer.setPhone("(555) 555-6453");
            customer.setAddress("1234 Main St");
            customer.setCity("Mount Sinai");
            customer.setState("Washington");
            customer.setZipCode("221223");

            customerDAO.create(customer);


        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
