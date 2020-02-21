package com.assignment.impl;

import com.assignment.intf.AddService;
import org.springframework.stereotype.Component;

@Component
public class AddServiceImpl implements AddService {

    public int addMethod(){
        int a=10;
        int b=20;
        int c= a+b;
    return c;
    }
}
