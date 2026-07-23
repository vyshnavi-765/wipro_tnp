package com.mile;

public class StudentReport {

    public String findGrades(Student student)
            throws NullStudentException,
            NullNameException,
            NullMarksArrayException {

        if (student == null)
            throw new NullStudentException();

        if (student.getName() == null)
            throw new NullNameException();

        if (student.getMarks() == null)
            throw new NullMarksArrayException();

        int sum = 0;

        for (int mark : student.getMarks()) {
            sum += mark;
        }

        double avg = (double) sum / student.getMarks().length;

        if (avg >= 80)
            return "A";

        else if (avg >= 60)
            return "B";

        else if (avg >= 50)
            return "C";

        else if (avg >= 35)
            return "D";

        else
            return "F";
    }
}