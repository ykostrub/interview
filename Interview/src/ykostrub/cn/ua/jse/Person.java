package ykostrub.cn.ua.jse;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public abstract class Person {
  
  private String name;

  public String getName() {
    return name;
  }

  public void setName(
      String name) {
    this.name = name;
  }

  public Person(
      String name) {
    super();
    this.name = name;
  }
  
  public abstract String getDescription();
  

}
