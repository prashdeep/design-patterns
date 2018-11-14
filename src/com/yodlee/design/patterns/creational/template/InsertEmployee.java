package com.yodlee.design.patterns.creational.template;

public class InsertEmployee {

    private static JdbcTemplate jdbcTemplate;

    public InsertEmployee(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public static void main(String[] args) {
        JdbcTemplate template =
                new MySQLJdbcTemplate("com.jdbc.mysql.Driver","jdbc:mysql://localhost:3306/db", "root", "password");
        template.execute();
    }
}