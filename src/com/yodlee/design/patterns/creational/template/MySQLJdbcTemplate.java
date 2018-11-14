package com.yodlee.design.patterns.creational.template;

public class MySQLJdbcTemplate extends JdbcTemplate {

    public MySQLJdbcTemplate(String driverName, String url, String username, String password ){
        super(driverName,url,username,password);
    }
    @Override
    protected void executeStatement(String sqlStatment) {
        statement.execute("insert into Employee");
    }
}