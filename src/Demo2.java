public class Demo2 {
  public static void main(String[] args) {
    Bank csumbBank = new Bank("CSUMB");
    csumbBank.openAccount("Tom Smith", "123 University Center 93955", 77777, 1000, 1, 100.50);
    System.out.println("\n\n===== ANSWER: One Account 1000: $100.50 (Tom Smith: 77777) =====");
    csumbBank.bankInfo();
    System.out.println("\n");
  }
}
