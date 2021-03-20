package com.weBank.weBank.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/7/21
 */
public class DataSourceConfig {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final static String driverClassName = "org.h2.Driver";
    private final static String url = "dbc:h2:mem:test";
    private final static String userName = "sa";
    private final static String password = "";
    @Bean
    public DataSource getDataSource(){
        logger.info("Creating in-memory h2 database with jdbc url [{}]", url);
        return DataSourceBuilder.create()
                .driverClassName(driverClassName)
                .url(url)
                .username(userName)
                .password(password)
                .build();

    }
}
