package com.cctest.programmedesign.controller;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.Data;

@JsonSubTypes({@JsonSubTypes.Type(value = ParamA.class, name = "aname")
        , @JsonSubTypes.Type(value = ParamB.class, name = "bname")})
public class Param {
    private String paramname;

    public String getParamname() {
        return paramname;
    }

    public void setParamname(String paramname) {
        this.paramname = paramname;
    }

    public Param(String paramname) {
        this.paramname = paramname;
    }
}
