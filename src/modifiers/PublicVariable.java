package modifiers;

// Public field - generally NOT recommended (breaks encapsulation)
public class PublicVariable {

  public String departmentName;
  private int numOfStudent;

  public int getNumOfStudent() {
    return numOfStudent;
  }

  public void setNumOfStudent(int numOfStudent) {
    this.numOfStudent = numOfStudent;
  }

}
