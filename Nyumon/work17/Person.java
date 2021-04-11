public class Person {
  int age;
  public void setAge(int age) {
    if (age < 0) {
      throw new IllegalArgumentException("年齢は０以上に設定せよ");
    }
    this.age = age;
  }
}