package com.practice;

public class Employee {
  String name;
  String department;
  double salary;

  public Employee(String name, String dept, double salary) {
    this.name = name;
    this.department = dept;
    this.salary = salary;
  }

  public String getName() { return name; }
  public String getDepartment() { return department; }
  public double getSalary() { return salary; }

  public static Employee[] getStaff() {
    Employee staff[] = {
      new Employee("Roy", "IT", 50000.0),
      new Employee("Maurice", "IT", 50000.0),
      new Employee("Richmond", "IT", 60000.0),
      new Employee("Jen", "Management", 70000.0),
      new Employee("Denholm", "Management", 100000.0)
    };
    return staff;
  }
}