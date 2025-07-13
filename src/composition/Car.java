package composition;

// Car Has-A Relationship with Engine
public class Car {

  private String model;
  private Engine engine;  // Car HAS-A Engine (Composition)

  public Car(String model, String engineType) {
    this.model = model;
    this.engine = new Engine(engineType);  // Engine is created when Car is created
  }

  public void startCar() {
    System.out.println("Starting " + model);
    engine.start();  // Using Engine's method
  }

  public String getModel() {
    return model;
  }

  public Engine getEngine() {
    return engine;
  }
}