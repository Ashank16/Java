class Bicycle{
  private String name;
  private String color;
  private int distance = 0;
  
  Bicycle(String name, String color){
    this.name = name;
    this.color = color;
  }
  
  public String getName(){
    return this.name = name;
  }
  
  public void printData(){
    System.out.println("【Bicycle Info】");
    System.out.println("Name: " + this.name);
    System.out.println("Color: " + this.color);
    System.out.println("Distance: " + distance + "km");
  }
}