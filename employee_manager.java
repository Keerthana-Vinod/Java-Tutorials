public class Main {
  public static void main(String[] args) {
  Employee employee = new Employee();
  employee.name = "John Doe";
  employee.age = 30;
  employee.phoneNumber = "1234567890";
  employee.address = "123 Street, City, Country";
  employee.salary = 50000;
  employee.specialization = "Software Development";

  Manager manager = new Manager();
  manager.name = "Jane Doe";
  manager.age = 40;
  manager.phoneNumber = "0987654321";
  manager.address = "456 Avenue, City, Country";
  manager.salary = 100000;
  manager.department = "Sales";

  System.out.println("Employee Details:");
  System.out.println("Name: " + employee.name);
  System.out.println("Age: " + employee.age);
  System.out.println("Phone Number: " + employee.phoneNumber);
  System.out.println("Address: " + employee.address);
  employee.printSalary();
  System.out.println("Specialization: " + employee.specialization);

  System.out.println("\nManager Details:");
  System.out.println("Name: " + manager.name);
  System.out.println("Age: " + manager.age);
  System.out.println("Phone Number: " + manager.phoneNumber);
  System.out.println("Address: " + manager.address);
  manager.printSalary();
  System.out.println("Department: " + manager.department);
  }
}

