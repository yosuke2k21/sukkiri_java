public class Matango {
  int hp;
  final int LEVEL = 10;
  char suffix;
  
  public Matango() {
    this.hp = 50;
  }
  
  public void run() {
    System.out.println("おばけキノコ" + this.suffix + "は逃げ出した！");
  }
  
}