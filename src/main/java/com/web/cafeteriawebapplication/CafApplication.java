package com.example.caf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CafApplication {

    public static void main(String[] args) {
        SpringApplication.run(CafApplication.class, args);
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("configs.xml");
        JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
        String insertSQL = "INSERT INTO customer (customer_id, name,surname,password,phonenumber) VALUES (?, ?)";
        int result = jdbcTemplate.update(insertSQL, 1, "Syes Arshad");

        System.out.println("Rows affected: " + result);

        ctx.close();
    }

}
