public class Demo8 {
  public static void main(String[] args) {
     Bank csumbBank = new Bank("CSUMB");
     csumbBank.openAccount("BBB BBB", "Incorrect Address", 22222, 2222, 1, 2.0);
     csumbBank.openAccount("CCC CCC", "Another Incorrect Address", 33333, 3333, 1, 3.0);
     csumbBank.updateBalance(2222, 222.22);
     csumbBank.updateBalance(3333, 333.33);
     System.out.println("\n\n===== ANSWER: Balance should be $222.22) =====");
     csumbBank.accountInfo(2222);
     System.out.println("\n\n===== ANSWER: Balance should be $333.33) =====");
     csumbBank.accountInfo(3333);
     System.out.println("\n");
  }
}
