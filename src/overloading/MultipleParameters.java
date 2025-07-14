package overloading;

class MultipleParameters {

  void show(int x, float y) {
    System.out.println("int-float version");
  }

  void show(float x, int y) {
    System.out.println("float-int version");
  }

  public static void main(String[] args) {
    MultipleParameters t = new MultipleParameters();
    t.show(10, 10.5f); // exact match - calls int-float version
    t.show(10.5f, 10); // exact match - calls float-int version
    // t.show(10, 10);    // ambiguous - can promote first or second argument
  }
}