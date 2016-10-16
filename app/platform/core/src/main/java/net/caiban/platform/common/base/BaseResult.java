/**
 * THIS FILE IS PART OF YYSOFT PROJECT
 * <p>
 * THIS PROGRAM IS FREE SOFTWARE, IT EXPECT TO HELP BUILD JAVA WEB SOFTWARE EASILY. IT IS LICENSED UNDER MIT.
 * <p>
 * Copyright (c) 2017 Mar(mays@caiban.net)
 */
package net.caiban.platform.common.base;

import net.caiban.platform.common.enums.BaseResultCodeEnum;

/**
 * Created by mar on 2016/10/3.
 */
public class BaseResult extends ToString {

    private static final long    serialVersionUID = -3411798478617194773L;
    /**
     * 成功状态
     */
    private              boolean success          = false;

    /**
     * 消息码
     */
    private String code;
    /**
     * 消息
     */
    private String message;

    /**
     * construct
     * @param success
     */
    public BaseResult(boolean success) {
        this.success = success;
        if (success) {
            this.code = BaseResultCodeEnum.SUCCESS.getCode();
            this.message = BaseResultCodeEnum.SUCCESS.getMessage();
        } else {
            this.code = BaseResultCodeEnum.SYSTEM_ERROR.getCode();
            this.message = BaseResultCodeEnum.SYSTEM_ERROR.getMessage();
        }
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>success</tt>.
     *
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property <tt>success</tt>.
     *
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Getter method for property <tt>message</tt>.
     *
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     *
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
