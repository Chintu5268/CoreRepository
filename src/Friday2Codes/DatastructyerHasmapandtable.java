package Friday2Codes;
import java.util.Hashtable;

public class DatastructyerHasmapandtable {
  public static void main(String[] args) {
    Hashtable <String,Integer> ht = new Hashtable<>();
    ht.put("Sandesh", 13);
    ht.put("piyush", 07);

    for (String string : ht.keySet()) {
      System.out.println("Key is "+ string + " value is "+ht.get(string));
    }

  }
}
