package inheritance;

class Parent3 {

  void m1() {
    System.out.println("Parent class m1() method");
  }
}

class Child3 extends Parent3 {

  void m1() {
    System.out.println("Child class m1() method");
  }

  void m2() {
    m1();
    super.m1(); //Parent class m1() method will be called
    System.out.println("Child class m2() method");
  }
}

public class ParentClassMethodCalling {

  public static void main(String[] args) {
    Child3 child3 = new Child3();
    child3.m2();
  }
}
