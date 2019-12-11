package com.wlwq.idfa.config;

import com.alibaba.druid.sql.parser.Lexer;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 迪富
 */
@Component
@Order(value = -100)
@Slf4j
@Aspect
public class DataSourceSwitchAspect {

    @Pointcut("execution(* com.wlwq.idfa.mapper.db1..*.*(..))")
    private void db1Aspect() {
    }

    @Pointcut("execution(* com.wlwq.idfa.mapper.db2..*.*(..))")
    private void db2Aspect() {
    }

    @Pointcut("execution(* com.wlwq.idfa.mapper.db3..*.*(..))")
    private void db3Aspect() {
    }

    @Before("db1Aspect()")
    public void db1() {
        log.info("切换到db1 数据源...");
        DbContextHolder.setDbType(DBTypeEnum.db1);
    }

    @Before("db2Aspect()")
    public void db2() {
        log.info("切换到db2 数据源...");
        DbContextHolder.setDbType(DBTypeEnum.db2);
    }

    @Before("db3Aspect()")
    public void db3() {
        log.info("切换到db3 数据源...");
        DbContextHolder.setDbType(DBTypeEnum.db3);
    }
}
