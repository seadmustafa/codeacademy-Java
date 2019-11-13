class Noodle {
  
  double lengthInCentimeters;
  String shape;
  String texture = "brittle";
  
  public void cook() {
    
    this.texture = "cooked";
    
  }
  
  public static void main(String[] args) {
    Spaghetti spaghettiPomodoro = new Spaghetti();
    Noodle noodle=new Noodle();
    System.out.println(noodle.texture);
  }
  
}
