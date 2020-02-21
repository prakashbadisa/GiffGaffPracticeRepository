package com.assignment.impl;

import com.assignment.intf.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class AssignmentImpl {

    @Autowired
    private AddService addService;

        public void displayValue(){
        int result = addService.addMethod();
        System.out.println("result is :"+result);

    }
}
