package Friday2Codes;
import java.util.ArrayList;

public class ClonaableArryList extends ArrayList implements Cloneable{

  @Override
  public Object clone() {
    return super.clone();
  }
  
  // creatae the main method 
  public static void main(String[] args) {
    // create the list 
    ArrayList<String> list1 = new ClonaableArryList();

  list1.add("Sandesh");
  list1.add("Piyush");
  list1.add("Rahul");

  try {
    CloneableArrayList<String> list2 = (CloneableArrayList<String>) list1.clone();
    
  } catch (Exception e) {
    // TODO: handle exception
  }

  }
}
