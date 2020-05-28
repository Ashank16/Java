class Car{
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;
  
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
    System.out.println("Fuel: " + fuel + "L");
  }
  
  public void run(int movDistance){
    System.out.println("Moving " + movDistance + "km ...");
    
    if (movDistance <= fuel){
      distance += movDistance;
      fuel -= movDistance;
    }else{
      System.out.println("Not enough fuel");
    } 
    
    System.out.println("Distance: " + distance + "km");
    System.out.println("Fuel: " + fuel + "L");
  }
  
  public void charge(int refuel){
    System.out.println("Adding " + refuel + "L ...");
    if(refuel <= 0){
      System.out.println("No fuel added");
    }else if((fuel + refuel) >= 100){
      System.out.println("Tank now full");
      fuel = 100;
    }else{
      fuel += refuel;
    }
    System.out.println("Fuel: " + fuel + "L");
  }
}