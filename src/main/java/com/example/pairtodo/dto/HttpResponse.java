package com.example.pairtodo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class HttpResponse<T> {
    private int code;
    private String msg;
    private Date tms;
    private T data;

    public HttpResponse() {}

    public HttpResponse(int code, String msg, Date tms, T data) {
        this.code = code;
        this.msg = msg;
        this.tms = tms;
        this.data = data;
    }
}