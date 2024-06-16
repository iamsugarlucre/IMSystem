package com.huawei.kunpengimsystem.enums;

public enum ResultEnum {
    /**
     * success
     */
    SUCCESS(1000),

    /**
     * fail
     */
    FAIL(1001),

    /**
     * Interface not found
     */
    NOT_FOUND(1002),

    /**
     * Server internal error
     */
    INTERNAL_SERVER_ERROR(1003);

    public int code;

    ResultEnum(int code) {
        this.code = code;
    }
}
