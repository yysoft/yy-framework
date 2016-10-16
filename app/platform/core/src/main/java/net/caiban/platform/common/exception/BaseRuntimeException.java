/**
 * THIS FILE IS PART OF YYSOFT PROJECT
 * <p>
 * THIS PROGRAM IS FREE SOFTWARE, IT EXPECT TO HELP BUILD JAVA WEB SOFTWARE EASILY. IT IS LICENSED UNDER MIT.
 * <p>
 * Copyright (c) 2017 Mar(mays@caiban.net)
 */
package net.caiban.platform.common.exception;

import net.caiban.platform.common.enums.LoggerEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mar on 2016/10/7.
 */
public class BaseRuntimeException extends RuntimeException {

    /**
     * 能用错误日志
     */
    Logger LOG_ALT = LoggerFactory.getLogger(LoggerEnum.COMMON_ERROR.getCode());

    public BaseRuntimeException(String message) {
        super(message);
        LOG_ALT.error(message);
    }

    public BaseRuntimeException(String message, Throwable e) {
        super(message, e);
        LOG_ALT.error(message, e);
    }
}
