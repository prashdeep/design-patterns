package com.yodlee.design.patterns.creational.demo;

public class DBConnectionFactory {

    private DBConnectionFactory(){}

    public static DBConnection getDBConnection(DBType dbType){
        switch (dbType){
            case MYSQL:
                return new MySQLDBConnection();
            case ORACLE:
                return new OracleDBConnection();
        }
        return null;

    }
}