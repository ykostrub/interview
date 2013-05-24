package ykostrub.cn.ua.patterns.prototype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PrototypeClone
implements Serializable
//implements Cloneable 
{
  public PrototypeClone(){}

  /** */
  private static final long serialVersionUID = -7271805744734254646L;
  private String name;
  private String value;
  private Date date;
  private Prototype pt;
  private List<Prototype> ls;

  public PrototypeClone(String name, String value
     , Date date
    ,  Prototype pt
    , List<Prototype> ls
      ) {
    this.name = name;
    this.value = value;
    this.date = date;
    this.pt = pt;
    this.ls = ls;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
//    return super.clone();
    PrototypeClone cl = (PrototypeClone) super.clone();
//
   cl.pt = (Prototype) pt.clone();
   cl.ls = (List<Prototype>) ((ArrayList<Prototype>) ls).clone();
    return cl;

  }

  @Override
  public String toString() {
    return "PrototypeClone [name=" + name + ", value=" + value
       + ", date=" + date + "]" +
       " , pt = "+ pt.getName() + " " + pt.getValue() 
        		+ ", ls = " + Arrays.asList(ls)
        ;
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

  public Date getDate() {
    return date;
  }

  public void setDate(
      Date date) {
    this.date = date;
  }

  public List<Prototype> getLs() {
    return ls;
  }

  public void setLs(
      List<Prototype> ls) {
    this.ls = ls;
  }
  
  public Prototype getPt() {
    return pt;
  }

  public void setPt(
      Prototype pt) {
    this.pt = pt;
  }



}
