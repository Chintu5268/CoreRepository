package Friday2Codes;
import java.util.HashMap;


public class HashCodeKeyExample {

    public static void main(String[] args) {
        
        HashMap<Integer, String> hashmap = new HashMap<>();
        
        String object1 = "object1";
        String object2 = "object2";
        String object3 = "object3";

        hashmap.put(object1.hashCode(), object1);
        hashmap.put(object2.hashCode(), object2);
        hashmap.put(object3.hashCode(), object3);

     

      for (Integer keycode : hashmap.keySet()) {
        System.out.println("Key Hashcode "+keycode + " kety vaylue is "+hashmap.get(keycode));
      }
    }
}