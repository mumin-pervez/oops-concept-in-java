package inheritance;

class Parent4 {

  Parent4() {
    System.out.println("Parent 0-arg Constructor");
  }
}

class Child4 extends Parent4 {

  Child4() {
    // super(); //Compiler automatically generated this
    System.out.println("Child 0-arg Constructor");
  }

  Child4(int a) {
    // super(); //Compiler automatically generated this
    System.out.println("Child 0-arg Constructor");
  }
}

public class DefaultSuperKeywordConstructor {

  public static void main(String[] args) {
    Child4 child41 = new Child4();
    Child4 child42 = new Child4(15);
  }
}
