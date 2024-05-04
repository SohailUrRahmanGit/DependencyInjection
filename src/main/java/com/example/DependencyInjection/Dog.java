package com.example.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Dog implements  Animal {
    @Override
    public void speak() {
        System.out.println("woof");
    }
}
