package ykostrub.cn.ua.jse;

/**
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class Manager extends Employee {

  public Manager(
      String name,
      double salary,
      int year,
      int month,
      int day,
      double bonus) {
    super(name, salary, year, month, day);
    this.bonus = bonus;
  }

  public Manager(
      String name,
      double salary,
      int year,
      int month,
      int day) {
    super(name, salary, year, month, day);
    this.bonus = 0;
  }

  private double bonus;

  public double getBonus() {
    return bonus;
  }

  public void setBonus(
      double bonus) {
    this.bonus = bonus;
  }

  @Override
  public double getSalary() {
    return super.getSalary() + bonus;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + ", [bonus = " + getBonus() + "]";
  }

}
