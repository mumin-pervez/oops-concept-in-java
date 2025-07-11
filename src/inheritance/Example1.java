package inheritance;

class ParentEx1 {

  void m1() {
    System.out.println("Parent class method");
  }
}

class ChildEx1 extends ParentEx1 {

  void m2() {
    System.out.println("Child class method");
  }
}

public class Example1 {

  public static void main(String[] args) {
    System.out.println("Parent class reference & Parent class object");
    System.out.println("--------------------------------------------");
    ParentEx1 parentEx1 = new ParentEx1();
    parentEx1.m1();
    // Parent class reference can't call child methods.
    // parentEx1.m2();

    System.out.println("Child class reference & Child class object");
    System.out.println("------------------------------------------");
    ChildEx1 childEx1 = new ChildEx1();
    //Child class reference can call both parent and child class methods.
    childEx1.m1();
    childEx1.m2();

    System.out.println("Parent class reference but Child class object");
    System.out.println("---------------------------------------------");
    ParentEx1 parentEx2 = new ChildEx1();
    parentEx2.m1();
    //Parent class reference can hold child class object but can't call child class methods.
    // parentEx2.m2();

    System.out.println("Child class reference but Parent class object");
    System.out.println("---------------------------------------------");
    // Child class reference can't hold Parent class object.
    // ChildEx1 childEx2 = new ParentEx1();

    // Object obj = new ChildEx1();

  }

}
