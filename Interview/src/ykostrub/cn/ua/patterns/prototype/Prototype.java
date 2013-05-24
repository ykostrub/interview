package ykostrub.cn.ua.patterns.prototype;

import java.io.Serializable;

public class Prototype 
// implements Serializable
  implements Cloneable
{
  
  public Prototype(){};
  
  /** */
  private static final long serialVersionUID = 19601759797267460L;
  private String name;
  private String value;
  
  public Prototype(Prototype original) {
    super();
    this.name = original.name;
    this.value = original.value;
  }

  public Prototype(
      String name,
      String value) {
    super();
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(
      String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(
      String value) {
    this.value = value;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "Prototype [name=" + name + ", value=" + value + "]";
  }
  
  
  
  
  
  
  
  
}
