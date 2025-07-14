package overloading;

public class OverloadingExample1 {

  public void showInfo(int i) {
    System.out.println("Integer type Argument : " + i);
  }

  public void showInfo(double d) {
    System.out.println("Integer type Argument : " + d);
  }
  // showInfo(int i) and showInfo(double d) are overloaded methods.
  // Same name and different numbers or types of argument

  public static void main(String[] args) {
    OverloadingExample1 ovl = new OverloadingExample1();
    ovl.showInfo(10);
    ovl.showInfo(10.5f);
    ovl.showInfo('P'); // Automatic promotion in overloading
  }

}
