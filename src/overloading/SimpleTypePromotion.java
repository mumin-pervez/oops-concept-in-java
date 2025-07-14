package overloading;

class Test {

  void show(int i) {
    System.out.println("int version");
  }
}

public class SimpleTypePromotion {

  public static void main(String[] args) {
    Test test = new Test();
    test.show(10); // Matched with show(int i) method
    test.show('a'); // Here automatically type promotion char ==> int
  }

}
