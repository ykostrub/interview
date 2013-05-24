package ykostrub.cn.ua.patterns.prototype;

public class Prototype2 extends Prototype implements Cloneable{

  public Prototype2(
      String name,
      String value) {
    super(name, value);
    // TODO Auto-generated constructor stub
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
  
  

}
