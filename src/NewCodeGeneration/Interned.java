package NewCodeGeneration;

public class Interned {
 public static void main(String[] args) {
  
  String S1 = new String("Hello");
  String S2 = new String("Hello");

  System.out.println("before interned");
  System.out.println(S1==S2);

  String S1interned = S1.intern();
  String Sinterned = S2.intern();
  System.out.println("After interned");
  System.out.println(S1interned==Sinterned);
 }
}
