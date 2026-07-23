package com.mile;

public class NullStudentException extends Exception {

    public NullStudentException() {
        super("Student object is null");
    }
}