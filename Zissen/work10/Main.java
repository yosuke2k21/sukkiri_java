import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Reader fr = new FileReader("ファイル名");
    Properties p = new Propertiess();
    
    p.load(fr);
    System.out.println(p.getProperty("aichi.capital") + ":" + p.getProperty("aichi.food"));
    fr.close();
  }
}