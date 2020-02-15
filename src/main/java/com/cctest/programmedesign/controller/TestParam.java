package com.cctest.programmedesign.controller;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.Data;

@Data
public class TestParam {
    private String type;

    private Param param;
}
