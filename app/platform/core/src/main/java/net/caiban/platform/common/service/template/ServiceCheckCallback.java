/**
 * THIS FILE IS PART OF YYSOFT PROJECT
 * <p>
 * THIS PROGRAM IS FREE SOFTWARE, IT EXPECT TO HELP BUILD JAVA WEB SOFTWARE EASILY. IT IS LICENSED UNDER MIT.
 * <p>
 * Copyright (c) 2017 Mar(mays@caiban.net)
 */
package net.caiban.platform.common.service.template;

/**
 * Created by mar on 2016/10/10.
 */
public interface ServiceCheckCallback extends ServiceCallback {

    /**
     * 校验，不通过则抛出异常
     */
    public void check();
}
