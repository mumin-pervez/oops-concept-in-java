package methodsignature;

public class MethodSignatureExample {

  void add(int a, int b) {
    System.out.println("add() method with 2 elements: " + a + " and " + b);
  }

/*  void add(int x, int y) {
    System.out.println("add() with 2 updated elements");
  }*/
  // Within a class, two methods with the same signature are Not Allowed.

  public static void main(String[] args) {
    MethodSignatureExample mse = new MethodSignatureExample();
    mse.add(10, 20);
  }

}
