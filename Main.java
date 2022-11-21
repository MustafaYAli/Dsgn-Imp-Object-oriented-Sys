import java.util.Scanner;

public class Main {
  //Creating an object of the Employee class
  public static Employee newEmployee = new Employee();
  public static Double pay = 0.0;
  public static String getName(Scanner input) {
    System.out.print("Enter employee name: ");
    String name = input.nextLine();
    // input validation
    while (name.isEmpty()) {
      System.out.println("Name cannot be empty");
      System.out.print("Enter employee name: ");
      name = input.nextLine();
    }
    return name;
  }

  public static String getAddress(Scanner input) {
    System.out.print("Enter employee address: ");
    String address = input.nextLine();
    // input validation
    while (address.isEmpty()) {
      System.out.println("Address cannot be empty");
      System.out.print("Enter employee address: ");
      address = input.nextLine();
    }
    return address;
  }

  public static int getNumber(Scanner input) {
    System.out.print("Enter employee number: ");
    String number = input.nextLine();
    // input validation
    while (!number.matches("[0-9]+")) {
      System.out.println("Number must be a number");
      System.out.print("Enter employee number: ");
      number = input.nextLine();
    }
    return Integer.parseInt(number);
  }

  public static double getHours(Scanner input) {
    System.out.print("Enter employee hours: ");
    String hours = input.nextLine();
    // input validation
    while (!hours.matches("[0-9]+")) {
      System.out.println("Hours must be a number");
      System.out.print("Enter employee hours: ");
      hours = input.nextLine();
    }
    return Double.parseDouble(hours);

  }

    public static double getRate(Scanner input) {
    System.out.print("Enter employee rate: ");
    String rate = input.nextLine();
    // input validation
    while (!rate.matches("[0-9]+")) {
      System.out.println("Rate must be a number");
      System.out.print("Enter employee rate: ");
      rate = input.nextLine();
    }
    return Double.parseDouble(rate);
       }


  public static double getOvertime(Scanner input) {
    System.out.print("Enter employee overtime: ");
    String overtime = input.nextLine();
    // input validation
    while (!overtime.matches("[0-9]+")) {
      System.out.println("Overtime must be a number");
      System.out.print("Enter employee overtime: ");
      overtime = input.nextLine();
    }
    return Double.parseDouble(overtime);
  }
  public static void main(String[] args) {

  //Create a Scanner object
  Scanner input = new Scanner(System.in);

  try {
    // Starting the dialog with the user
    System.out.println("Welcome to the Employee Management System");
    System.out.println("Please enter your name: ");
    String name = getName(input);
    System.out.println("Please enter your address: ");
    String address = getAddress(input);
    System.out.println("Please enter your employee number: ");
    int number = getNumber(input);
    System.out.println("Please enter your hours: ");
    double hours = getHours(input);
    System.out.println("Please enter your rate: ");
    double rate = getRate(input);
    System.out.println("Please enter your overtime: ");
    double overtime = getOvertime(input);
    // Creating the employee object with the user input
    newEmployee = new Employee(name, address, number,  hours, rate, overtime);
    pay = newEmployee.calculateWeeklyPay();
  } catch (Exception e) {
    System.out.println("An error occured");
  } finally {
    // Printing the weekly pay
    System.out.println("Your weekly pay is: " + pay);
    // Closing the Scanner object
    input.close();
  }
  Check payCheck = new Check();
  payCheck.PrintCheck(newEmployee.calculateWeeklyPay(), newEmployee.getName(), newEmployee.getAddress(), newEmployee.getNumber());
  }


}
