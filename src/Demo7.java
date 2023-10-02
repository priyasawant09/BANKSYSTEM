public class Demo7 {
  public static void main(String[] args) {
    Bank csumbBank = new Bank("CSUMB");
    csumbBank.openAccount("BBB BBB", "Incorrect Address", 22222, 2222, 1, 2.0);
    csumbBank.openAccount("CCC CCC", "Another Incorrect Address", 33333, 3333, 1, 3.0);
    csumbBank.updateAddress(3333, "Address CCC");
    csumbBank.updateAddress(1111, "Address AAA");
    csumbBank.updateAddress(2222, "Address BBB");
    System.out.println("\n\n===== ANSWER: Address should be \"Address BBB\") =====");
    csumbBank.accountInfo(2222);
    System.out.println("\n\n===== ANSWER: Address should be \"Address CCC\") =====");
    csumbBank.accountInfo(3333);

    System.out.println("\n");
  }
}
