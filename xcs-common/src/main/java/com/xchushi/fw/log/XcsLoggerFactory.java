package com.xchushi.fw.log;

import com.xchushi.fw.log.elasticsearch.logger.TCPEsLogger;

/**
 * 日志工厂，用以构建logger实例
 * 
 * @author: SamJoker
 * @date: 2018-03-09
 */
public class XcsLoggerFactory {

    public static XcsLogger getLogger(Class<?> cls) {
        XcsLogger xcsLogger = TCPEsLogger.getLogger(cls);
        xcsLogger.start();
        return xcsLogger;
    }

    public static <T extends XcsLogger> T getLogger(Class<?> cls, LoggerBuilder<T> builder) {
        return builder.buildLogger(cls);
    }

}
