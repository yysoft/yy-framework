/**
 * THIS FILE IS PART OF YYSOFT PROJECT
 * <p>
 * THIS PROGRAM IS FREE SOFTWARE, IT EXPECT TO HELP BUILD JAVA WEB SOFTWARE EASILY. IT IS LICENSED UNDER MIT.
 * <p>
 * Copyright (c) 2017 Mar(mays@caiban.net)
 */
package net.caiban.platform.common.base;

import java.util.List;

/**
 * 基本查询结果对象
 * <p>
 * Created by mar on 2016/10/6.
 */
public class BaseQueryResult<T> extends BaseResult {

    private static final long serialVersionUID = -4807528460435186526L;
    /**
     * 查询结果集
     */
    private T obj;

    /**
     * construct
     *
     * @param success
     */
    public BaseQueryResult(boolean success) {
        super(success);
    }

    /**
     * Getter method for property <tt>obj</tt>.
     *
     * @return property value of obj
     */
    public T getObj() {
        return obj;
    }

    /**
     * Setter method for property <tt>obj</tt>.
     *
     * @param obj value to be assigned to property obj
     */
    public void setObj(T obj) {
        this.obj = obj;
    }
}
