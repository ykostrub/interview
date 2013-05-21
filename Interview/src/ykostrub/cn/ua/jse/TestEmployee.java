package ykostrub.cn.ua.jse;

import java.util.Arrays;

public class TestEmployee {
  
  public static void main(
      String[] args) {
    
    Employee [] staff = new Employee[3];
    staff[0] = new Employee("David Cop", 123, 1990, 1, 12);
    staff[1] = new Employee("David Moyes", 126, 1987, 12, 1);
    staff[2] = new Employee("Tony Tramp", 123, 1980, 11, 22);
    System.out.println(Arrays.toString(staff));
    
    for (Employee employee : staff) {
      employee.raiseSalary(5);
    }
    System.out.println(Arrays.toString(staff));
    
  }

}
