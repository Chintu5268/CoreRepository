package NewCodeGeneration;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
  public static void main(String[] args) throws IOException {
    Student stud = new Student();
    stud.setName("Sandesh");
    stud.setName("Sarade");
    stud.setMobile(9860113);
    FileOutputStream fos= null;
    ObjectOutputStream oos=null;
    try {
       fos = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Sandesh.txt");
      oos = new ObjectOutputStream(fos);
      oos.writeObject(stud);
      
      System.out.println("Data inserted Sucessfully...");
    } catch (Exception e) {
      e.getMessage();
    }finally{
      oos.close();
      fos.close();
    }
  }
}
