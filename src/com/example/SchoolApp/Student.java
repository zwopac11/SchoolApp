package com.example.SchoolApp;

/**
 * Created by Freidoun Heidary on 10/16/2014.
 */
public class Student {
    private String usename;
    private String password;

    public Student(String usename) {
        this.usename = usename;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }
}
