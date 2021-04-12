public class Main {
  public static boolean isOdd(int x) {
    return x % 2 == 1;
  }
  
  public static String addNamePrefix(boolean male, String name) {
    if (male == true) { return "Mr." + name; }
    else { return "Ms." + name; }
  }
  
  public static void main(String[] args) {
    // Func1 p1 = Main::isOdd;
    // boolean b = p1.test1(2);
    // System.out.println(b);
    // 
    // Func2 p2 = Main::addNamePrefix;
    // String s = p2.addNamePrefix(true, "yosuke");
    // System.out.println(s);
    
    Func1 f1 = x -> x % 2 == 1;
    Func2 f2 = (male, name) -> { 
      if (male == true) { return "Mr." + name; }
      else { return "Ms." + name; }
    };
  }
}