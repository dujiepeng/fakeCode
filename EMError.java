package com.hyphenate.myapplication.code;

public class EMError {
}
class HyphenateException extends Exception{
    public int code;
    public HyphenateException(int code, String message) {
        super(message);
        this.code = code;
    }

    static void throwEMException(int code, String message) throws HyphenateException {
        throw new HyphenateException(code, message);
    }
}