package inheritance;

class ParentClass1 {

  void m1() {
    System.out.println("Parent Class m1() method");
  }

  void display() {
    System.out.println("Parent class display() method");
  }
}

class ChildClass1 extends ParentClass1 {

  void m2() {
    m1(); // Method calling from parent class
    System.out.println("Child Class m2() method");
    display();
  }

  // Same method names in parent and child classes are allowed.
  void display() {
    System.out.println("Child class display() method");
  }
}

public class ChildClassMethodCalling {

  public static void main(String[] args) {
    ParentClass1 parentClass1 = new ParentClass1();
    parentClass1.display();

    ChildClass1 childClass1 = new ChildClass1();
    childClass1.display();

    ParentClass1 parentChild = new ChildClass1();
    parentChild.display();
    // ChildClass1 childParent = new ParentClass1(); // This is not Possible

    childClass1.m1(); // Child class object calling the parent class method
    childClass1.m2(); // Child class object calling the child class method
  }
}
