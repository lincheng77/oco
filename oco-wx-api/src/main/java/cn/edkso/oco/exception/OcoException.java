package cn.edkso.oco.exception;

import lombok.Data;

@Data
public class OcoException extends RuntimeException{

    private String msg;
    private int code = 500;

    public OcoException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public OcoException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public OcoException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public OcoException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }
}
