class Person {
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }
  
  // Define the fullName method
  public String fullName(){
    return firstName + " " + lastName;
  }
  
  // Define the bmi method
  public double bmi(){
    return weight / height / height;
  }
  
}
