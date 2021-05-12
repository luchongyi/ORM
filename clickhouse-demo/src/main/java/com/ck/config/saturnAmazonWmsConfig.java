package com.ck.config;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = saturnAmazonWmsConfig.SCAN_PACKAGE, sqlSessionFactoryRef = "ckSqlSessionFactory")
public class saturnAmazonWmsConfig {

    public static final String SCAN_PACKAGE = "com.ck.mapper";
    public static final String MAPPER_LOCATION = "classpath*:mapper/*.xml";


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.clickhouse")
    public DataSource ckDataSource(){
        return DataSourceBuilder.create().build();
    }


    @Bean
    public SqlSessionFactory ckSqlSessionFactory(@Qualifier("ckDataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        //设置mapper location
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(saturnAmazonWmsConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

    @Bean
    public SqlSessionTemplate saturnAmazonWmsSqlSessionTemplate(@Qualifier("ckSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }



}

