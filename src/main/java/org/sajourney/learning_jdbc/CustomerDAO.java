package org.sajourney.learning_jdbc;

import org.sajourney.learning_jdbc.util.DataAccessObject;

import java.sql.Connection;
import java.util.List;

public class CustomerDAO extends DataAccessObject<Customer> {

    private static final String INSERT = "INSERT INTO customer (first_name, " +
            "last_name, email, phone, address, city, state, zipcode) VALUES(?,?,?,?,?,?,?,?)";

    public CustomerDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Customer findById(long id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer update(Customer dto) {
        return null;
    }

    @Override
    public Customer create(Customer dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
