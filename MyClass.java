package office;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int numberOfEmployees = scanner.nextInt();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Branch: ");
            String Designation = scanner.nextLine();

            System.out.print("Rating: ");
            double rating = scanner.nextDouble();

            System.out.print("Using company transport (true/false): ");
            boolean companyTransport = scanner.nextBoolean();

            employees.add(new Employee(employeeId, name, Designation, rating, companyTransport));
        }

        int count = findCountOfEmployeesUsingCompTransport(employees);
        System.out.println("Number of employees using company transport: " + count);

        Employee secondHighestRatingEmployee = findEmployeeWithSecondHighestRating(employees);
            System.out.println("Employee with the second highest rating: " + secondHighestRatingEmployee.getName());
            System.out.println("ID:"+secondHighestRatingEmployee.getEmployeeId());
            System.out.println("Branch:"+secondHighestRatingEmployee.getBranch());
       

        scanner.close();
    }

    public static int findCountOfEmployeesUsingCompTransport(List<Employee> employees) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.isCompanyTransport()) {
                count++;
            }
        }
        return count;
    }

    public static Employee findEmployeeWithSecondHighestRating(List<Employee> employees) {
        if (employees.size() < 2) {
            return null; 
        }

        List<Employee> sortedEmployees = new ArrayList<>(employees);
        sortedEmployees.sort(Comparator.comparingDouble(Employee::getRating).reversed());

        return sortedEmployees.get(1); 
    }

	}


