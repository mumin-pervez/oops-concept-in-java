package inheritance;

class Parent {

  int a = 10;
  int b = 20;
}

class Child extends Parent {

  int a = 100;
  int b = 200;

  void add(int a, int b) {
    System.out.println(a + b);
    System.out.println(this.a + this.b); // Current class variables represented by "this" keyword
    System.out.println(super.a + super.b); // Parent class variables represented by "super" keyword
  }
}

public class SuperKeyword {

  public static void main(String[] args) {
    Child child = new Child();
    child.add(1000, 2000);
  }
}
