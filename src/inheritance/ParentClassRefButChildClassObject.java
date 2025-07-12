package inheritance;

class Parent2 {

  void add() {
    System.out.println("Parent Class Method");
  }
}

class Child2 extends Parent2 {

  void mul() {
    System.out.println("Child Class Method");
  }

  void add() {
    System.out.println("Modified parent method in Child class");
  }
}

public class ParentClassRefButChildClassObject {

  public static void main(String[] args) {
    Parent2 p2 = new Child2(); // But class reference holds child class object
    //  p2.add();
    // Parent class method is called.
    // This will be happened only the add() method is in parent class.
    p2.add();
    // But now add() method is overridden in the child class.
    // So updated add() method which is in the child class will be called.

  }

}
