class Person{
  public static void printData(String firstName,String lastName,int age,double height,double weight){
    System.out.println("My name is " + fullName(firstName,lastName) + ".");
    System.out.println("I am " + age + " years old.");
    
    if(age >= 18){
      System.out.println("I am an adult.");
    }else{
      System.out.println("I am not an adult.");
    }
    
    System.out.println("I am " + height + "m tall.");
    System.out.println("I weigh " + weight + "kg.");
    
    System.out.println("My BMI is " + bmi(height,weight) + ".");
    
  }
  public static String fullName(String firstName,String lastName){
    return firstName + " " + lastName;
  }
  public static double bmi(double height,double weight){
    return weight/height/height;
  }
  
}