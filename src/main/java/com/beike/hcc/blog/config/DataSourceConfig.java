package com.beike.hcc.blog.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.beike.hcc.blog.mapper",sqlSessionFactoryRef = "sqlSessionFactory")
public class DataSourceConfig {
    static final String MAPPER_LOCATION="classpath:mapper/*.xml";
    @Value("${jdbc.datasource.convention.username}")
    private String user;

    @Value("${jdbc.datasource.convention.url}")
    private String url;

    @Value("${jdbc.datasource.convention.password}")
    private String password;

    @Value("${jdbc.datasource.convention.driverClassName}")
    private String driverClass;

    @Bean(name="conventionDataSource")
    public DataSource getDataSource(){
        DruidDataSource dataSource =new DruidDataSource();//数据连接池
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Bean(name="sqlSessionFactory")
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("conventionDataSource") DataSource dataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(DataSourceConfig.MAPPER_LOCATION));
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setDefaultStatementTimeout(Integer.parseInt("20"));
        sessionFactory.setConfiguration(configuration);
        return sessionFactory.getObject();
    }

}
