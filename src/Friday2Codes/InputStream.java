package Friday2Codes;
import java.io.FileInputStream;
import java.util.Scanner;

public class InputStream {
  public static void main(String[] args) {
    try {
      FileInputStream fileInputStream = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\chatGpt.txt");
      Scanner sc = new Scanner(fileInputStream);

      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
      
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
