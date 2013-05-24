package ykostrub.cn.ua.patterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CloneUtils {
  
  public static final Object deepClone(Object objToClone)
  {
      try
      {
          ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(100);
          ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
          objectoutputstream.writeObject(objToClone);
          byte abyte0[] = bytearrayoutputstream.toByteArray();
          objectoutputstream.close();
          ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
          ObjectInputStream objectinputstream = new ObjectInputStream(bytearrayinputstream);
          Object clone = objectinputstream.readObject();
          objectinputstream.close();
          return clone;
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
      return null;
  }

}
