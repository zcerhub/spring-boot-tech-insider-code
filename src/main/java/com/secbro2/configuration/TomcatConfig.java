package com.secbro2.configuration;


import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class TomcatConfig {

    @Bean
    public ConfigurableServletWebServerFactory webServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.setPort(8081);
        Session session = new Session();
        session.setTimeout(Duration.ofMinutes(30L));
        factory.setSession(session);
        Set<ErrorPage> errorPages=new HashSet<>();
        ErrorPage errorPage = new ErrorPage("/error");
        errorPages.add(errorPage);
        factory.setErrorPages(errorPages);
        return factory;
    }


}
