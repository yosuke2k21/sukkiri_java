public class Wizard extends Character {
  String name;
  int hp;
  
  public Wizard(String name) {
    this.hp = 50;
    this.name = name;
  }
  
  public void run() {
    
  }
  
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に３ポイントのダメージ");
    m.hp -= 3;
  }
  
  public void fireball(Matango m) {
    System.out.println(this.name + "火の玉を放った");
    System.out.println("敵に20ポイントのダメージ");
    m.hp -= 20;
    this.mp -= 5;
  }
  
  public void heal(Hero h) {
    h.hp += 10;
    System.out.println(h.name + "のHPを回復した");
  }
}