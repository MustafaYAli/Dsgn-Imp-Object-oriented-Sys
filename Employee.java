public class Employee {
  String name;
    String address;
    int number;
    double salary;
    double hours;
    double rate;
    double overtime;

// a method to calculate the weekly pay
    public double calculateWeeklyPay() {
        double pay = 0;
        if (hours <= 40) {
            pay = hours * rate;
        } else {
            pay = (40 * rate) + ((hours - 40) * (rate * 1.5));
        }
        return pay;
    }


    // Constructor
    public Employee(String name, String address, int number, double hours, double rate, double overtime) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
        this.hours = hours;
        this.rate = rate;
        this.overtime = overtime;
    }
// creating a default constructor
    public Employee() {
    }

    //Setters and Getters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getOvertime() {
    return overtime;
  }

  public void setOvertime(double overtime) {
    this.overtime = overtime;
  }
}
