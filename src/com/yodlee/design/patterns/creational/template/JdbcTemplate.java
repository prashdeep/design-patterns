package com.yodlee.design.patterns.creational.template;

import javax.swing.plaf.nimbus.State;

public abstract class JdbcTemplate {

    private final String url;
    private final String usename;
    private final String password;
    private final String driverName;
    protected Statement statement;

    public JdbcTemplate(String driverName, String url, String username, String password){
        this.driverName = driverName;
        this.url = url;
        this.usename = username;
        this.password = password;

    }

    public void execute(){

        loadDriver();

        initializeConnection();

        createStatement();

        executeStatement("");

        closeStatement();

        closeConnection();
    }

    private void closeConnection() {
        System.out.println("Closing the DB Connection");

    }

    private void closeStatement() {
        System.out.println("Closing the JBConnection");

    }

    protected abstract void executeStatement(String sql);

    private void createStatement() {
        System.out.println("Creating the statement");
        this.statement = new Statement() {
            @Override
            public void execute(String sql) {
                System.out.println("Inside the execute method of Statement");
            }

            @Override
            public int executeUpdate(String sql) {
                return 0;
            }
        };
        System.out.println("Creating the statement");

    }

    private void initializeConnection() {
        System.out.println("Initializing the DB Connection");
    }

    private void loadDriver() {
        System.out.println("Loading the Jdbc Driver "+this.driverName);
    }


}