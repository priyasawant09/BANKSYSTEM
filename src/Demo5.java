public class Demo5 {
   public static void main(String[] args) {
      Bank csumbBank = new Bank("CSUMB");
      csumbBank.closeAccount(3333);
      csumbBank.closeAccount(2222);
      csumbBank.openAccount("BBB BBB", "Address B", 22222, 2222, 2, 2.0);
      csumbBank.openAccount("AAA AAA", "Address A", 11111, 1111, 2, 100.0);
      csumbBank.openAccount("CCC CCC", "Address C", 33333, 3333, 2, 3.0);
      csumbBank.closeAccount(3333);
      csumbBank.closeAccount(2222);
      csumbBank.openAccount("CCC CCC", "Address C", 33333, 3333, 2, 300.0);
      csumbBank.openAccount("BBB BBB", "Address B", 22222, 2222, 2, 200.0);
      System.out.println("\n\n===== ANSWER: Three Accounts with total balance $600.00 =====");
      csumbBank.bankInfo();
      System.out.println("\n");
   }
}
