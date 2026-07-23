package com.mile;

public class StudentService {

    public void validate(Student student)
            throws NullStudentException,
            NullNameException,
            NullMarksArrayException {

        if (student == null)
            throw new NullStudentException();

        if (student.getName() == null)
            throw new NullNameException();

        if (student.getMarks() == null)
            throw new NullMarksArrayException();
    }
}