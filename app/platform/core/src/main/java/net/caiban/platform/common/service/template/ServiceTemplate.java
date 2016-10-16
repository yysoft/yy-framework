/**
 * THIS FILE IS PART OF YYSOFT PROJECT
 * <p>
 * THIS PROGRAM IS FREE SOFTWARE, IT EXPECT TO HELP BUILD JAVA WEB SOFTWARE EASILY. IT IS LICENSED UNDER MIT.
 * <p>
 * Copyright (c) 2017 Mar(mays@caiban.net)
 */
package net.caiban.platform.common.service.template;

import net.caiban.platform.common.base.BaseResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 事务模板方法
 *
 * Created by mar on 2016/10/10.
 */
public interface ServiceTemplate {

    /**
     * 事务环境下执行业务处理
     *
     * @param result
     * @param action
     */
    public void execute(BaseResult result, ServiceCallback action);

    /**
     * 事务环境下执行业务处理
     *
     * @param action
     */
    public void execute(ServiceCallback action);

    /**无事务模板执行业务处理
     * @param result
     * @param action
     */
    public void executeWithoutTransaction(BaseResult result, ServiceCallback action);

    /**
     * 直接获取本地事务
     *
     * @return
     */
    public TransactionTemplate getTransactionTemplate();
}
