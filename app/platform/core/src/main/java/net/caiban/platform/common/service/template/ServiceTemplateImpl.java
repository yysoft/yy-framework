/**
 * THIS FILE IS PART OF YYSOFT PROJECT
 * <p>
 * THIS PROGRAM IS FREE SOFTWARE, IT EXPECT TO HELP BUILD JAVA WEB SOFTWARE EASILY. IT IS LICENSED UNDER MIT.
 * <p>
 * Copyright (c) 2017 Mar(mays@caiban.net)
 */
package net.caiban.platform.common.service.template;

import net.caiban.platform.common.base.BaseResult;
import net.caiban.platform.common.enums.BaseResultCodeEnum;
import net.caiban.platform.common.exception.BaseRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 服务模板实现
 *
 * Created by mar on 2016/10/10.
 */
public class ServiceTemplateImpl implements ServiceTemplate {

    /**
     * logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(ServiceTemplateImpl.class);

    /**
     * 事务模板
     */
    private TransactionTemplate transactionTemplate;

    /**
     * @see ServiceTemplate#execute(net.caiban.platform.common.base.BaseResult, net.caiban.platform.common.service.template.ServiceCallback)
     */
    @Override
    public void execute(final BaseResult result, final ServiceCallback action) {
        transactionTemplate.execute(new TransactionCallback() {

            @Override
            public Object doInTransaction(TransactionStatus status) {
                try {

                    if (action instanceof ServiceCheckCallback) {
                        ((ServiceCheckCallback) action).check();
                    }

                    {
                        action.executeService();
                    }

                    if (result.isSuccess()) {
                        result.setMessage(BaseResultCodeEnum.SUCCESS.getMessage());
                    }
                } catch (BaseRuntimeException be) {
                    LOG.error("业务处理异常", be);

                    status.setRollbackOnly();

                    result.setSuccess(false);
                    result.setMessage(be.getMessage());
                } finally {
                    LOG.info("业务处理操作结果：", result);
                }
                return result;
            }
        });
    }

    /**
     * @see ServiceTemplate#execute(ServiceCallback)
     */
    @Override
    public void execute(final ServiceCallback action) {
        final BaseResult result = new BaseResult(true);
        transactionTemplate.execute(new TransactionCallback() {

            @Override
            public Object doInTransaction(TransactionStatus status) {
                try {

                    if (action instanceof ServiceCheckCallback) {
                        ((ServiceCheckCallback) action).check();
                    }

                    {
                        action.executeService();
                    }

                    if (result.isSuccess()) {
                        result.setMessage(BaseResultCodeEnum.SUCCESS.getMessage());
                    }
                } catch (BaseRuntimeException be) {
                    LOG.error("业务处理异常", be);

                    status.setRollbackOnly();

                    result.setSuccess(false);
                    result.setMessage(be.getMessage());
                } finally {
                    LOG.info("业务处理操作结果：", result);
                }
                return result;
            }
        });
    }

    /**
     * @see ServiceTemplate#executeWithoutTransaction(BaseResult, ServiceCallback)
     */
    @Override
    public void executeWithoutTransaction(final BaseResult result, final ServiceCallback action) {
        try {

            if (action instanceof ServiceCheckCallback) {
                ((ServiceCheckCallback) action).check();
            }

            {
                action.executeService();
            }

            if (result.isSuccess()) {
                result.setMessage(BaseResultCodeEnum.SUCCESS.getMessage());
            }
        } catch (BaseRuntimeException be) {
            LOG.error("业务处理异常", be);

            result.setSuccess(false);
            result.setMessage(be.getMessage());
        } finally {
            LOG.info("业务处理操作结果：", result);
        }
    }


    /**
     * @see ServiceTemplate#getTransactionTemplate()
     */
    @Override
    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }

    /**
     * Setter method for property <tt>transactionTemplate</tt>.
     *
     * @param transactionTemplate value to be assigned to property transactionTemplate
     */
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
}
