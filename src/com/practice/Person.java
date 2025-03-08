package com.practice;

public class Person {
    String name;
    int dateOfDOB;
    int monthOfDOB;
    int yearOfDOB;

    public Person(String name, int month, int date, int year) {
        this.name = name;
        this.dateOfDOB = date;
        this.monthOfDOB = month;
        this.yearOfDOB = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfDOB() {
        return dateOfDOB;
    }

    public void setDateOfDOB(int dateOfDOB) {
        this.dateOfDOB = dateOfDOB;
    }

    public int getMonthOfDOB() {
        return monthOfDOB;
    }

    public void setMonthOfDOB(int monthOfDOB) {
        this.monthOfDOB = monthOfDOB;
    }

    public int getYearOfDOB() {
        return yearOfDOB;
    }

    public void setYearOfDOB(int yearOfDOB) {
        this.yearOfDOB = yearOfDOB;
    }

    //getter and setter
}
