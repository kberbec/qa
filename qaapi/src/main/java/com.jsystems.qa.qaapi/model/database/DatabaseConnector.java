package com.jsystems.qa.qaapi.model.database;

import com.jsystems.qa.qaapi.model.configuration.ApiConfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
    private static Connection connection = null;
    public static Connection.getConnection()   {

        if (connection = null) initConnection();
        return connection;
    }

    private static void initConnection(){
    try {

        class.forName(ApiConfig.DB_CLASS);
        String url = ApiConfig.DB_URL;
        String user = ApiConfig.DB_USER;
        String pass = ApiConfig.DB_PASSWORD;
        Connection = DriverManager.getConnection(url, user, password);
    } catch (ClassNotFoundException e){
        e.printStackTrace();
    }

    }
}