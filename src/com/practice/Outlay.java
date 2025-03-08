package com.practice;

import java.util.*;
import java.util.function.DoubleBinaryOperator;

class WageCalculator implements DoubleBinaryOperator {
  int month;
  double bonus = 1000.0;

  public WageCalculator(int whichMonth) {
    this.month = whichMonth;
  }

  public double applyAsDouble(double left, double right) {
    if (month == 12) {
      return left + right + bonus;
    } else {
      return left + right;
    }
  }
}

public class Outlay {
  public static void main(String args[]) throws Exception {
    int month = args.length == 1 ? Integer.parseInt(args[0]) : 8;
    Employee[] staff = Employee.getStaff();
    WageCalculator wages = new WageCalculator(month);

    double total = Arrays.stream(staff)
        .mapToDouble(Employee::getSalary)
        .reduce(0.0, wages);
    System.out.println("The outlay for month " + month + " is " + total);
  }
}