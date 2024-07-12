package Friday2Codes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayWithHashMap {
 public static void main(String[] args) {
  
  HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

  // Create an ArrayList of Strings
  ArrayList<String> list1 = new ArrayList<>();
  list1.add("Alice");
  list1.add("Bob");
  list1.add("Charlie");

  // Create another ArrayList of Strings
  ArrayList<String> list2 = new ArrayList<>();
  list2.add("David");
  list2.add("Eve");
  list2.add("Frank");

  // Put the ArrayLists into the HashMap
  hashMap.put("Group1", list1);
  hashMap.put("Group2", list2);

  // Print the HashMap
  for (String key : hashMap.keySet()) {
      System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
  }
 }
}
