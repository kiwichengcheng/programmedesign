package com.cctest.programmedesign.compositionaggregation;

public class PostgreSqlConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "postgresql connection";
    }
}
