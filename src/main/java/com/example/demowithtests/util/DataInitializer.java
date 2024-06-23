//package com.example.demowithtests.util;
//
//import com.example.demowithtests.model.Gender;
//import lombok.extern.log4j.Log4j;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//@Component
//@Log4j2
//public class DataInitializer implements CommandLineRunner {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public void run(String... args) throws Exception {
//        log.info("DataInitializer run method started.");
//        batchInsertEmployees();
//        log.info("DataInitializer run method completed.");
//    }
//
//    private void batchInsertEmployees() {
//        String sql = "INSERT INTO users (name, country, email, gender) VALUES (?, ?, ?, ?)";
//
//        List<Object[]> batchArgs = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            Object[] employeeData = {
//                    "Employee" + i,
//                    "Country" + (i % 100),
//                    "employee" + i + "@example.com",
//                    Gender.values()[random.nextInt(Gender.values().length)].toString()
//            };
//            batchArgs.add(employeeData);
//        }
//
//        jdbcTemplate.batchUpdate(sql, batchArgs);
//    }
//}