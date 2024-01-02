
public class App{
    public static void main(String[] args) {
      String firstName = "John";
      String lastName = "Doe";
      int age = 24;
      int amount = 178;
  
      System.out.println(firstName);
      System.out.println(lastName);
      System.out.println(age);
      System.out.println(amount);
  
      boolean married = false;
  
      double amount2 = 20;
      String deposit = "Deposit";
      String withdraw = "Withdraw";
  
      System.out.println("The amount is " + amount2 + "KD\nWould you like to " +
      deposit + " or " + withdraw + "?");
  
      int amount3 = 5;
      System.out.println(amount3 + " plus " + amount3 + " makes " + (amount3 +
      amount3) + ".");
  
      String fullName = " John doe";
      System.out.println("My name is " + fullName.substring(1, 5).toUpperCase() + " and my last name length is " + fullName.substring(6).length() + ".");
  
      System.out.println(fullName.charAt(6) == 'd');
    }
  }