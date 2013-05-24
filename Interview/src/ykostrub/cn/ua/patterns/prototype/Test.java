package ykostrub.cn.ua.patterns.prototype;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.SerializationUtils;

import com.rits.cloning.Cloner;
public class Test {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    try {
//
      ArrayList<Prototype> ls = new ArrayList<Prototype>();
      ls.add(new Prototype("1","2"));
      ls.add(new Prototype("3","4"));
      
      PrototypeClone cl = new PrototypeClone("aaa", "bbb"
          , new Date()
          , new Prototype("1","2")
      , ls
          );
      
  //   PrototypeClone cl2 = (PrototypeClone) cl.clone();
     
     Thread.currentThread().sleep(1000L);
 //     PrototypeClone cl2 = (PrototypeClone) BeanUtils.cloneBean(cl);   
//      
//      Cloner c = new Cloner();
//      PrototypeClone cl2 = c.deepClone(cl);
      
//      PrototypeClone cl2 = (PrototypeClone) CloneUtils.deepClone(cl);
      PrototypeClone cl2 = (PrototypeClone) SerializationUtils.clone(cl);
      cl.getLs().get(0).setName("1234");
      cl.getPt().setName("3");
//      
      cl.setName("ccc");
      cl.setDate(new Date());
      cl.getPt().setName("3333");
//      cl.getPt().setName("3");
      
      System.out.println("clone 1 = " + cl);
      System.out.println("clone 2 = " + cl2);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
