package Friday2Codes;
import java.util.ArrayList;
import java.util.List;

public class ConcurrentModuifications {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");

    for (String string : list) {
      while (string.equals("two")) {
        list.add(string);
      }
      System.out.println("After removal "+string);
    }

  }
}
