package composition;

public class Engine {

  private String type;

  public Engine(String type) {
    this.type = type;
  }

  public void start() {
    System.out.println("Engine (" + type + ") started.");
  }

  public String getType() {
    return type;
  }
}
