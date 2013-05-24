package ykostrub.cn.ua.jse;


public class TestEmployee {
  
  public static void main(
      String[] args) {
    
    Person [] p = new Person[4];
    p[0] = new Employee("David Cop", 123, 1990, 1, 12);
    p[1] = new Employee("David Moyes", 126, 1987, 12, 1);
    p[2] = new Employee("Tony Tramp", 123, 1980, 11, 22);
    p[3] = new Student("Stive Jobs", "computer science");
    
    for (Person person : p) {
      System.out.println("name = " + person.getName() +", " + person.getDescription());
    }

    
  }

}
