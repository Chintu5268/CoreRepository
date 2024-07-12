package Friday2Codes;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurremtHashmapDemo {
  public static void main(String[] args) {
    ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
    map.put("S", 1);
    map.put("B", 2);
    map.put("O",31);

    map.putIfAbsent("D", 69);
    map.replace("O", 45);

   for (String string : map.keySet()) {
    System.out.println("Key "+string + " value "+map.get(string));
   }
  }
}
