package com.assignment.main;

import com.assignment.impl.AssignmentImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.assignment")
public class SpringAssignmentApplication {

    public static void main(String[] args) {
        System.out.println("Spring Assignment Application started successfully");
        ApplicationContext applicationContext= SpringApplication.run(SpringAssignmentApplication.class, args);
        AssignmentImpl assignment = applicationContext.getBean(AssignmentImpl.class);
        assignment.displayValue();
        System.out.println("Spring application ended");
    }

}
