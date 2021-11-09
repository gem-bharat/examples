package com.Test.jdbc;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@NoArgsConstructor
public class JdbcConnection {
    public void CreateConnection(){
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "root");
            System.out.println("Opened database successfully");

            statement = connection.createStatement();
            String sql = "CREATE TABLE ABC " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " NAME           TEXT    NOT NULL, " +
                    " AGE            INT     NOT NULL, " +
                    " ADDRESS        CHAR(50), " +
                    " SALARY         REAL)";
            statement.executeUpdate(sql);
            statement.close();
            connection.close();
            System.out.println("Table created successfully");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
        }
    }

}


