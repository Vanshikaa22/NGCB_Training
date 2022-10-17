package com.training.annotation;

@SuppressWarnings("deprecation")
@MyAnnotation(message = "Calling Annotation from Class")
public class Main {
    @MethodAnnotation
    public void TestingMethodAnnotation() {
        System.out.println("Hello");
    }
}