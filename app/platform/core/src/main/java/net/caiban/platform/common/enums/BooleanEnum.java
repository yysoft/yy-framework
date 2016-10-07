/**
 * THIS FILE IS PART OF YYSOFT PROJECT
 * <p>
 * THIS PROGRAM IS FREE SOFTWARE, IT EXPECT TO HELP BUILD JAVA WEB SOFTWARE EASILY. IT IS LICENSED UNDER MIT.
 * <p>
 * Copyright (c) 2017 Mar(mays@caiban.net)
 */
package net.caiban.platform.common.enums;

/**
 * Created by mar on 2016/10/7.
 */
public enum BooleanEnum implements BaseEnum {

    /**
     * true
     */
    TRUE("T", "true"),

    /**
     * false
     */
    FALE("F", "false");

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
    private BooleanEnum(String code, String message) {
        this.code = code;
        this.message = message;
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
