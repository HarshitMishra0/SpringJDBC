package com.springJDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.springJDBC.dao.StudentDaoImpl;
import com.springJDBC.dao.StudentDao;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.springJDBC.dao"})
public class JdbcConfig {

    //In this bean update your sql database username and password
    @Bean("ds")
    public DataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/jdbc");
        ds.setUsername("root");
        ds.setPassword("Achintya@123");
        return ds;

    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;

    }


}



