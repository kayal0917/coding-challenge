package office;

public class Member {
	    String name;
	    int age;
	    String phoneNumber;
	    String address;
	    double salary;

	    public void printSalary() {
	        System.out.println("Salary: " + salary);
	    }
	    public class Main {
	        public static void main(String[] args) {
	            Manager manager = new Manager("kayal", 25, "9876543210", "E7 St", 7500, "IT Department");
	            manager.printManagerDetails();
	            
	            Employe employee = new Employe("joe", 30, "1234567890", "123 Main St", 50000, "Software Development");
	            employee.printEmployeeDetails();


	        }
	    }

	}

	


