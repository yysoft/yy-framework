/**
 * THIS FILE IS PART OF YYSOFT PROJECT
 * <p>
 * THIS PROGRAM IS FREE SOFTWARE, IT EXPECT TO HELP BUILD JAVA WEB SOFTWARE EASILY. IT IS LICENSED UNDER MIT.
 * <p>
 * Copyright (c) 2017 Mar(mays@caiban.net)
 */
package net.caiban.platform.common.enums;

import java.util.zip.CheckedInputStream;

/**
 * Created by mar on 2016/10/10.
 */
public enum BaseResultCodeEnum implements BaseEnum {

    /**
     * 操作成功
     */
    SUCCESS("SUCCESS", "操作成功"),

    /**
     * 系统异常
     */
    SYSTEM_ERROR("SYSTEM_ERROR", "系统异常，请联系管理员！"),

    /**
     * 外部接口调用异常
     */
    INTERFACE_SYSTEM_ERROR("INTERFACE_SYSTEM_ERROR", "外部接口调用异常，请联系管理员！"),

    /**
     * 业务连接处理超时
     */
    CONNECT_TIME_OUT("CONNECT_TIME_OUT", "系统超时，请稍后再试!"),

    /**
     * 系统错误
     */
    SYSTEM_FAILURE("SYSTEM_FAILURE", "系统错误"),

    /**
     * 参数为空
     */
    NULL_ARGUMENT("NULL_ARGUMENT", "参数为空"),

    /**
     * 参数不正确
     */
    ILLEGAL_ARGUMENT("ILLEGAL_ARGUMENT", "参数不正确"),

    /**
     * 逻辑错误
     */
    LOGIC_ERROR("LOGIC_ERROR", "逻辑错误"),

    /**
     * 无操作权限
     */
    AUTH_DENIED("AUTH_DENIED", "无操作权限"),

    /**
     * 数据异常
     */
    DATA_ERROR("DATA_ERROR", "数据异常"),

    /**
     * 交易金额不正确
     */
    TRADE_MONEY_ERROR("TRADE_MONEY_ERROR", "交易金额不正确"),

    ;

    /**
     * CODE值
     */
    private String code;

    /**
     * 消息
     */
    private String message;

    /**
     * @param code
     * @param message
     */
    private BaseResultCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 通过字符串获取枚举
     *
     * @param b
     * @return
     */
    public BaseResultCodeEnum nameOf(String b) {
        for (BaseResultCodeEnum be : BaseResultCodeEnum.values()) {
            if (be.name().equals(b)) {
                return be;
            }
        }
        return null;
    }

    /**
    * @see BaseEnum#getMessage()
    */
    @Override
    public String getMessage() {
        return this.message;
    }

    /**
    * @see BaseEnum#getCode()
    */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
    * @see BaseEnum#getValue()
    */
    @Override
    public Integer getValue() {
        return null;
    }
}
