package NewCodeGeneration;

import java.io.FileWriter;

public class FileOutPut {
  public static void main(String[] args) {
    try {
      // create one object of filewriter
    FileWriter fiw = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\chatGpt.txt");
    fiw.write("Hello Sandesh Sarde");
    fiw.close();
    System.out.println("Prgram saved Sucessfully....");
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
