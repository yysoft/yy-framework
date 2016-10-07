/**
 * THIS FILE IS PART OF YYSOFT PROJECT
 * <p>
 * THIS PROGRAM IS FREE SOFTWARE, IT EXPECT TO HELP BUILD JAVA WEB SOFTWARE EASILY. IT IS LICENSED UNDER MIT.
 * <p>
 * Copyright (c) 2017 Mar(mays@caiban.net)
 */
package net.caiban.platform.common.enums;

/**
 * Created by mar on 2016/10/3.
 */
public abstract interface BaseEnum {

    /**
     * 获取枚举文本信息
     *
     * @return
     */
    public String getMessage();

    /**
     * 获取code
     *
     * @return
     */
    public String getCode();

    /**
     * 获取数值
     *
     * @return
     */
    public Integer getValue();
}
