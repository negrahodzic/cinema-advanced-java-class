/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author remmi
 */
@Configuration
@Import(DatabaseConfiguration.class)
@EnableWebMvc
@ComponentScan(basePackages = {
    "rs.njt.webapp.njtbioskopprojekat.controller",
    "rs.njt.webapp.njtbioskopprojekat.repository",
    "rs.njt.webapp.njtbioskopprojekat.service"
})

public class MyWebApplicationContextConfig {
    @Bean
    public ViewResolver createViewResolver(){
        InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return  viewResolver;
    }
}
