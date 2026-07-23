package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile.Student;
import com.mile.StudentReport;

public class TestStudent {

    @Test
    public void testGradeA() throws Exception {

        Student s = new Student("Rahul",
                new int[] {90, 85, 88});

        StudentReport report = new StudentReport();

        assertEquals("A", report.findGrades(s));
    }

    @Test
    public void testGradeD() throws Exception {

        Student s = new Student("Ravi",
                new int[] {35, 40, 38});

        StudentReport report = new StudentReport();

        assertEquals("D", report.findGrades(s));
    }

    @Test
    public void testGradeF() throws Exception {

        Student s = new Student("Sai",
                new int[] {10, 20, 15});

        StudentReport report = new StudentReport();

        assertEquals("F", report.findGrades(s));
    }
}