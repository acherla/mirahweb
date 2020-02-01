package com.miranet.webservice.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class HsqlDatabaseConfiguration {

    @Bean
    @Primary
    public DataSource dataSource(){
        return new HikariDataSource(hikariConfig());
    }

    private HikariConfig hikariConfig() {
        HikariConfig config = new HikariConfig();
        config.setMaximumPoolSize(100);
        config.setJdbcUrl("jdbc:hsqldb:mem:spindleDB");
        config.setPoolName("PRIMARY_POOL");
        config.setMinimumIdle(1);
        config.setAutoCommit(true);
        return config;
    }
}
