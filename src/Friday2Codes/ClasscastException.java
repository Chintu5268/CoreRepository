package Friday2Codes;
import java.util.ArrayList;

public class ClasscastException {
   public static void main(String[] args) {
       
    ArrayList rawlist = new ArrayList<>();

    rawlist.add("Hello sandesh");
    rawlist.add(25);

    try {
      for (Object valuess : rawlist) {
        int str = (int) valuess;
        System.out.println("Element are  "+ str);
      }
    }finally{
      System.out.println("Thanky for finally..");
    }
   }
}
