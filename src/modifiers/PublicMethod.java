package modifiers;

class MyMathClass {

  public int num1 = 10;
  public int num2 = 15;

  //Declaring method as public
  public void add() {
    System.out.println("Addition is : " + (num1 + num2));
  }
}

public class PublicMethod {

  public static void main(String[] args) {
    MyMathClass obj = new MyMathClass();
    obj.add();

  }

}
