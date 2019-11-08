package com.cctest.programmedesign.compositionaggregation;

public class MysqlConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "mysql connection";
    }
}
