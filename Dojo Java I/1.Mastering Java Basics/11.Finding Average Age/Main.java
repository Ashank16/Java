import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Number of people: ");
    int count = scanner.nextInt();
    
    int maxAge = 0;
    double sumAge = 0;
    
    for (int i = 1; i <= count; i++){
      System.out.println("Person number " + i);
      
      System.out.print("First name: ");
      String firstName = scanner.next();
    
      System.out.print("Last name: ");
      String lastName = scanner.next();
    
      System.out.print("Age: ");
      int age = scanner.nextInt();
    
      System.out.print("Height (m): ");
      double height = scanner.nextDouble();
    
      System.out.print("Weight (kg): ");
      double weight = scanner.nextDouble();
    
      Person.printData(firstName,lastName,age,height,weight);
      
      if (age > maxAge){
        maxAge = age;
      } 
      
      sumAge += age;
      
    } 
    
    System.out.println("Age of oldest person: " + maxAge + ".");
    System.out.println("Average age: " + (sumAge / count) + ".");
    
  }
}