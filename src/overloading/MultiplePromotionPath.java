package overloading;

class TestMTP {

  void show(float f) {
    System.out.println("Float version");
  }

  void show(long l) {
    System.out.println("Long version");
  }
}

public class MultiplePromotionPath {

  public static void main(String[] args) {
    TestMTP mtp = new TestMTP();
    mtp.show(3.14156784f);     // It will call the show(float f) method
    mtp.show(87987678899778L); // It will call the show(long l) method

    mtp.show(10); // 10 will be promoted to long, so it will call  show(long l) method
  }
}

/*
Output:
    Float version
    Long version
    Long version
    */
