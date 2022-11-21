public class Check {

  public  void PrintCheck(Double pay, String name, String address, int number) {
    System.out.println("\n\n\n");
    System.out.println("(############### BANK OF AMERICA ###############)");
    System.out.println("(________________________________________________)");
    System.out.println("Pay to the order of " + name + " the sum of " + pay);
    System.out.println("Mailing address: " + address);
    System.out.println("Employee number: " + number);
    System.out.println("By signing below, you agree to the terms and conditions of this check");
    System.out.println("(________________________________________________)");
    System.out.println("Signature: ");
  }
}
