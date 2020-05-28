class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle("Bianchi", "Green");
    bicycle.printData();
    System.out.println("-----------------");
    bicycle.run(10);
  }
}