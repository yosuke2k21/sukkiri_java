// 練習１５−１
public class Main {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      s.append(i + ",");
    }
    System.out.println(s);
  }
}

// 練習１５−４
import java.text.SimpleDateFormat;
import java.util.Calender;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Date now = new Date();
    Calender c = Calender.getInstance();
    
    c.setTime(now);
    
    int day = c.get(Calender.DAY_OF_MONTH);
    
    day += 100;
    c.set(Calender.DAY_OF_MONTH, day);
    
    Date future = c.getTime();
    
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年mm月dd日");
    System.out.println(f.format(future));
  }
}