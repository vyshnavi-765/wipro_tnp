package com.mile;

public class NullNameException extends Exception {

    public NullNameException() {
        super("Student name is null");
    }
}