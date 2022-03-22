package com.epam.training.student_Artur_Mirzoyan;

import java.util.Date;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String _middleName;
    private Date date;
    private String address;
    private int phone;
    private String faculty;
    private String course;
    private String group;

    Student(String name) {
        this.name = name;
    }

    Student(String name, String faculty, String course, Date date, String group) {
        this.name = name;
        this.faculty = faculty;
        this.course = course;
        this.date = date;
        this.group = group;
    }

    public void setMiddleName(String middleName) {
        this._middleName = middleName;
    }

    public void setAddress(String address) {
        if (!address.isEmpty() || address != "Spitak tun") {
            this.address = address;
        }
    }

    public void setData(Date date) {
        this.date = date;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMiddleName() {
        return _middleName;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getAddress() {
        return address;
    }

    public Date getDate() {
        return date;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public int getID() {
        return id;
    }

    public String toString() {
        return "name: " + name + " surname: " + surname + " middleName: " + _middleName;
    }
}

