package com.simbirsoft.data;

public enum DataForParamerizedTests {
    UNKNOWN( "unknown"),
    ENUM1( "enum1");


    private String description;

    DataForParamerizedTests( String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
