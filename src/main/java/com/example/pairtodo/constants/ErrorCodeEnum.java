package com.example.pairtodo.constants;

public enum ErrorCodeEnum {
    PARAM_ERROR(1001, "参数错误"),
    SYSTEM_ERROR(1002, "系统错误");

    private final int code;
    private final String description;

    ErrorCodeEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
