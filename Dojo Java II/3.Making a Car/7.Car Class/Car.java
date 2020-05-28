class Car{
  private String name;
  private String color;
  private int distance = 0;
  
  Car(String name, String color){
    this.name = name;
    this.color = color;
  }
  
  public String getName(){
    return this.name = name;
  }
  
  public void printData(){
    System.out.println("【Car Info】");
    System.out.println("Name: " + this.name);
    System.out.println("Color: " + this.color);
    System.out.println("Distance: " + distance + "km");
  }
  
  public void run(int movDistance){
    System.out.println("Moving " + movDistance + "km ...");
    distance += movDistance;
    System.out.println("Distance: " + distance + "km");
  }
}