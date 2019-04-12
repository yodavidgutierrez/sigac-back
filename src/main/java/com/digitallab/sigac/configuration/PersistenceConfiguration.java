package com.digitallab.sigac.configuration;

import com.digitallab.sigac.commons.constants.core.DeployType;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Log4j2
@Configuration
@EnableConfigurationProperties
public class PersistenceConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSourceConfiguration configuration() {
        return new DataSourceConfiguration();
    }

    @Bean
    @Profile({DeployType.DEVELOP, DeployType.TEST, DeployType.QA, DeployType.PRODUCTION})
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        if (log.isDebugEnabled())
            log.info("Datasource Connection Properties: {}", configuration().toString());
        dataSource.setDriverClassName(configuration().driverClassName);
        dataSource.setUrl(configuration().url);
        dataSource.setUsername(configuration().username);
        dataSource.setPassword(configuration().password);
        dataSource.setSchema(configuration().schema);
        return dataSource;
    }


    @Data
    @Getter
    @ToString
    private static class DataSourceConfiguration {

        private String url;
        private String username;
        private String password;
        private String driver;
        private String driverClassName;
        private String maxActive;
        private String maxIdle;
        private String minIdle;
        private String initialSize;
        private String removeAbandoned;
        private String schema;

    }


}
