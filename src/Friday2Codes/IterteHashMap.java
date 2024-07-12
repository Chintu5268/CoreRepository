package Friday2Codes;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IterteHashMap {
  public static void main(String[] args) {
    HashMap <String, Integer> map = new HashMap<>();
    map.put("one", 1);
    map.put("two", 2);
    map.put("three", 3);
    map.put("four", 4);
    map.put("five", 5);

    // varriuys way it iterate the hashmap

    // by using entryset()
   for (Map.Entry<String, Integer> keyss: map.entrySet()) {
    System.out.println("Key is "+keyss+ " values is "+ keyss.getValue());
    
   }
   System.out.println(" ");
   // by using key set

   for (String  keysss : map.keySet()) {
    System.out.println("Key is "+keysss+ " values is "+ map.get(keysss));   
   }
   System.out.println(" ");
   for (Integer string : map.values()) {
    System.out.println(string);
    
   }
    System.out.println(" ");
   map.forEach((key,value)->{
      System.out.println("key is "+key + " value is "+value);
   });

   // while using iterator

     
  }
}
