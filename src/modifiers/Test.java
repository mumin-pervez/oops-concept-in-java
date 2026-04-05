package modifiers;

public class Test {

  public static void main(String[] args) {
    MyMathClass myMathClass = new MyMathClass();
    myMathClass.add(); //add() is a public method and accessed from different class.

    // public variable
    PublicVariable publicVariable = new PublicVariable();
    publicVariable.departmentName = "BBA";
    publicVariable.setNumOfStudent(44);
    int totalStudent = publicVariable.getNumOfStudent();
    System.out.println(totalStudent);

  }

}
