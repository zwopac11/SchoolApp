package com.example.SchoolApp;

public class Student {
    private String username;
    private String password;

    public Student(String username, String password) {
        this.username = username; this.password = password;
    }


    public String getUsename() {

        return username;
    }

    public void setUsename(String usename) {

        this.username = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
