package WEEK_5;
public class App {
  public static void main(String[] args) throws Exception {
    LandVehicle car = new LandVehicle("Car", 100, 100, 4);
    car.move();
    car.calculateFuelConsumption(50);
  }
}
