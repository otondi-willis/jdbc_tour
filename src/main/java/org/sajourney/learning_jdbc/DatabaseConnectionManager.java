package org.sajourney.learning_jdbc;

import org.postgresql.util.PSQLException;

public class DatabaseConnectionManager {
    private final String url;
    private final Properties properties;

    public DatabaseConnectionManager(String host,
                                     String databaseName,
                                     String username,
                                     String password){
        this.url = "jdbc:postgressql://"+host+"/"+databaseName;
        this.properties = new Properties();
        this.properties.setProperty("user", username);
        this.properties.setProperty("password", password);

    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }




}
