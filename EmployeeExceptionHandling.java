class EmployeeDetails {
    String name;
    int age = 45 ;

    public EmployeeDetails(String name, int age) throws NameException, AgeException {
        if (isNumeric(name)) {
            throw new NameException("Employee name cannot be a number.");
        }

        if (age > 50) {
            throw new AgeException("Employee age cannot be greater than 50.");
        }

        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class EmployeeExceptionHandling {
    public static void main(String[] args) {
        try {
            String name = "John"; // Replace with the employee's name.
            int age = 55; // Replace with the employee's age.

            EmployeeDetails employee = new EmployeeDetails(name, age);
            employee.display();
        } catch (NameException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
