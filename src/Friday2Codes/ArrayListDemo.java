package Friday2Codes;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
  public static void main(String[] args) {
    
     ArrayList<String> list1 = new ArrayList<>();
     list1.add("Alice");
     list1.add("Bob");
     list1.add("Charlie");

     list1.add(2, "Shivam");

    Iterator itr= list1.iterator();
    while (itr.hasNext()) {
     String obj= (String) itr.next();
     System.out.println(obj);
    }
    System.out.println("By using lmabda expression");
    // by using lambda expression 
    list1.forEach(p->System.out.println(p));
  }
}
