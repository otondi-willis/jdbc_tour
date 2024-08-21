package org.sajourney.learning_jdbc;

public class DatabaseConnectionManager {
    private final String url;
    private final Properties properties;

    public DatabaseConnectionManager(String host,
                                     String databaseName,
                                     String username,
                                     String password){
        this.url = "jdbc:postgressql://"+host+"/"+databaseName;
        this.properties = new

    }




}
