/**
 * THIS FILE IS PART OF YYSOFT PROJECT
 * <p>
 * THIS PROGRAM IS FREE SOFTWARE, IT EXPECT TO HELP BUILD JAVA WEB SOFTWARE EASILY. IT IS LICENSED UNDER MIT.
 * <p>
 * Copyright (c) 2017 Mar(mays@caiban.net)
 */
package net.caiban.platform.common.enums;

/**
 * 日志枚举
 * Created by mar on 2016/10/7.
 */
public enum LoggerEnum implements BaseEnum {

    /**
     * 接口集成层日志
     */
    INTERGRATION("net.caiban.common.intergration", "接口集成层日志"),

    /**
     * 服务层日志
     */
    BIZ_SERVICE("net.caiban.biz.service", "服务层日志"),

    /**
     * 任务层日志
     */
    BIZ_TASK("net.caiban.biz.task", "任务层日志"),

    /**
     * 核心业务层日志
     */
    CORE_SERVICE("net.caiban.core.service","核心业务层日志"),

    /**
     * 通用错误日志
     */
    COMMON_ERROR("net.caiban.common.error", "通用错误日志");

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
    private LoggerEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 通过字符串获取枚举
     *
     * @param b
     * @return
     */
    public LoggerEnum nameOf(String b) {
        for (LoggerEnum be : LoggerEnum.values()) {
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
        if ("T".equals(this.code)) {
            return 1;
        }
        return 0;
    }
}
