package ykostrub.cn.ua.jse;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person {

  private double salary;
  private Date hireDay;

  public Employee(
      final String name,
      final double salary,
      final int year,
      final int month,
      final int day) {
    super(name);
    this.salary = salary;
    GregorianCalendar c = new GregorianCalendar(year, month -1, day);
    this.hireDay = c.getTime();
  }



  public double getSalary() {
    return salary;
  }

  public void setSalary(
      double salary) {
    this.salary = salary;
  }

  public Date getHireDay() {
    return hireDay;
  }

  public void setHireDay(
      Date hireDay) {
    this.hireDay = hireDay;
  }

  public void raiseSalary(
      double byPersent) {
    double raise = salary * byPersent / 100;
    salary += raise;
  }

  @Override
  public String toString() {
    return "Employee [name=" + super.getName() + ", salary=" + getSalary() + ", hireDay=" + hireDay + "]";
  }



  @Override
  public String getDescription() {
    return String.format( "an employee with a salaryof $%.2f", salary);
  }

  
  
}
