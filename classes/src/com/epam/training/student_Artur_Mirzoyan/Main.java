package com.epam.training.student_Artur_Mirzoyan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        //Student

        Student[] students = new Student[]{
                new Student("Tom", "It", "Epam", new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2001"),
                        "Starter"),
                new Student("Alex", "It", "Epam", new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1990"),
                        "Starter"),
                new Student("Jhon", "It", "Google", new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1995"),
                        "Starter"),
                new Student("Jimi", "Economy", "Google", new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2000"),
                        "Advance"),
                new Student("Jack", "Economy", "Google", new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2003"),
                        "Advance")
        };
        // task a
        ArrayList<Student> facultiyOfIttudents = new ArrayList<Student>();
        for (Student st : students) {
            if (st.getFaculty() == "It") {
                facultiyOfIttudents.add(st);
            }
        }

        //Task c
        ArrayList<Student> FilterByDateStudents = new ArrayList<Student>();
        for (Student st : students) {
            if (st.getDate().after(new SimpleDateFormat("dd/MM/yyyy").parse("30/12/2000"))) {
                FilterByDateStudents.add(st);
            }
        }
        //Task d
        ArrayList<String> groupOfStudents = new ArrayList<String>();
        for (Student st : students) {
            if (!groupOfStudents.contains(st.getGroup())) {
                groupOfStudents.add(st.getGroup());
            }
        }
    }

}
