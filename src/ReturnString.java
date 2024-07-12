public class ReturnString {
  public String geString(String name){
    return name;
    
  }
  public static void main(String[] args) {
    ReturnString returnString = new ReturnString();
    String name2=returnString.geString("Sandesh");
    System.out.println("Hello "+name2);

  }
}
