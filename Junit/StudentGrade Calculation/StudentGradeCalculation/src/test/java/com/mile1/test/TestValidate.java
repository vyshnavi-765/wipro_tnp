package com.mile1.test;

import org.junit.Test;

import com.mile.*;

public class TestValidate {

    StudentService service = new StudentService();

    @Test(expected = NullStudentException.class)
    public void testNullStudent() throws Exception {

        service.validate(null);
    }

    @Test(expected = NullNameException.class)
    public void testNullName() throws Exception {

        Student s = new Student(null, new int[]{90,80,70});
        service.validate(s);
    }

    @Test(expected = NullMarksArrayException.class)
    public void testNullMarks() throws Exception {

        Student s = new Student("Rahul", null);
        service.validate(s);
    }
}