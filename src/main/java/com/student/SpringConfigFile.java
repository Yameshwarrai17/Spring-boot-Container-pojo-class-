package com.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public StudentBp StudentBean() {
        StudentBp std = new StudentBp();
        std.setName("Yami");
        std.setRoll_no(42);
        std.setEmail("yameshwar17@gmail.com");
        return std;

    }

}
