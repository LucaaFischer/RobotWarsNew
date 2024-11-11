package com.btcag.bootcamp.Classes.Enums;

public enum Colors {
    RED("\u001b[31;1m1"),
    BLUE("\u001B[34m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    MAGENTA("\u001B[35m"),
    PURPLE("\u001B[35m"),
    STOP("\u001B[0m");

    private final String value;

    Colors(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
