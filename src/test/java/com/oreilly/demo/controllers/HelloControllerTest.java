package com.oreilly.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    public void sayHello()
    {
        HelloController helloController = new HelloController();
        Model model = new BindingAwareModelMap();
        String result = helloController.sayHello("WORLD",model);
        assertAll(
                () -> assertEquals("WORLD",model.getAttribute("user")),
                () -> assertEquals("hello",result)
        );

    }

    public static void main(String[] args) {

        for(int i =1 ; i < 6; i++) {
            System.out.print(abc(i) + " ");
        }
    }
    static int abc(int n)
    {
        if(n==0|| n==1||n==2)
        {
            return 0;
        }
        if(n==3)
        {
            return 1;
        }else
        return abc(n -1) + abc(n -2) + abc(n -3);
    }
}
