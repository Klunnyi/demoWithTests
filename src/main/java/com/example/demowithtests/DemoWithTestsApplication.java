package com.example.demowithtests;

import com.example.demowithtests.model.Employee;
import com.example.demowithtests.model.Gender;
import com.example.demowithtests.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class DemoWithTestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoWithTestsApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
//        return args -> {
//            List<Employee> employees = new ArrayList<>();
//            for (int i = 0; i < 100000; i++) {
//                Employee employee = Employee.builder()
//                        .name("Employee" + i)
//                        .country("Country" + (i % 100))
//                        .email("employee" + i + "@example.com")
//                        .gender(Gender.values()[new Random().nextInt(Gender.values().length)])
//                        .build();
//                employees.add(employee);
//            }
//            employeeRepository.saveAll(employees);
//        };
//    }

}
