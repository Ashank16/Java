class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27);
    
    // Replace the printData arguments with the fullName method
    printData(fullName("John","Christopher","Smith"), 65);
  }

  public static void printData(String name, int age) {
    System.out.println("My name is " + name + ".");
    System.out.println("I am " + age + " years old.");
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
  
  // Define the fullName method
  public static String fullName(String firstName,String middleName,String lastName){
    return firstName + " " + middleName + " " + lastName;
  }
  
}
