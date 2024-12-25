package com.student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        // Retrieve the StudentBp bean
        StudentBp std = context.getBean(StudentBp.class);
        std.Display();

        context.close();
    }
}
