import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle bicycle = new Bicycle("Bianchi", "Green");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("Enter distance to move: ");
    int distBicycle = scanner.nextInt();
    
    bicycle.run(distBicycle);
    System.out.println("=================");
    Car car = new Car("Ferrari", "Red");
    car.printData();
    System.out.println("-----------------");
    System.out.print("Enter distance to move: ");
    int distCar = scanner.nextInt();
    
    car.run(distCar);
  }
}