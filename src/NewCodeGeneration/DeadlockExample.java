package NewCodeGeneration;

public class DeadlockExample {
  public static void main(String[] args) {
      final Object resource1 = "Resource 1";
      final Object resource2 = "Resource 2";

      // Thread 1 tries to lock resource1 then resource2
      Thread thread1 = new Thread(() -> {
          synchronized (resource1) {
              System.out.println("Thread 1: locked resource 1");

              // Adding some delay to make deadlock more likely to occur
              try { Thread.sleep(100); } catch (InterruptedException e) {}

              synchronized (resource2) {
                  System.out.println("Thread 1: locked resource 2");
              }
          }
      });

      // Thread 2 tries to lock resource2 then resource1
      Thread thread2 = new Thread(() -> {
          synchronized (resource2) {
              System.out.println("Thread 2: locked resource 2");

              // Adding some delay to make deadlock more likely to occur
              try { Thread.sleep(100); } catch (InterruptedException e) {}

              synchronized (resource1) {
                  System.out.println("Thread 2: locked resource 1");
              }
          }
      });

      thread1.start();
      thread2.start();
  }
}

