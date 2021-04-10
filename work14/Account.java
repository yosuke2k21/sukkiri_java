public class Account {
  String accountNumber;
  int balance;
  
  public String toString() {
    return "¥¥" + this.balance + "(口座番号:" + this.accountNumber + ")";    
  }
}