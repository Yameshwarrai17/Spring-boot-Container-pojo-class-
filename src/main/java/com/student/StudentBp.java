package com.student;

import org.springframework.stereotype.Component;

@Component
public class StudentBp {
    private String Name;
    private int roll_no;
    private String email;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Display() {
        System.out.println("Name    :- " + Name);
        System.out.println("Roll_no :- " + roll_no);
        System.out.println("Email   :- " + email);
    }

}
