package com.jackiew.springjtademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.core.CollectionFactory;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;
import javax.jms.XAConnectionFactory;
import javax.sql.DataSource;
import javax.sql.XADataSource;

@SpringBootApplication(scanBasePackages = "com.jackiew")
@EnableJpaRepositories(basePackages = "com.jackiew.repo")
@EntityScan("com.jackiew.domain")
public class SpringJtaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJtaDemoApplication.class, args);
    }

    @Bean
    public JmsTemplate jmsTemplate(ConnectionFactory factory) {
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(factory);
        return template;
    }
}
