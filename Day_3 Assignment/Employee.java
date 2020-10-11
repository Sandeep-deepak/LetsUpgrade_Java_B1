import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        // Questions 2:
            //  Take employee name,date of birth,month of birth
            //  birth year, monthly salary;
            //  5l - 20%;
            //  4l - 15%;
            //  3l- 10%;
            //  2l -5%;
            //  Display name,age,annual salary and the tax amount
        String name;
        int date;
        int month;
        int year;
        int salary;

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter name : ");
        name = scanner.next();
        System.out.println("Enter DD : ");
        date = scanner.nextInt();
        System.out.println("Enter MM : ");
        month = scanner.nextInt();
        System.out.println("Enter YYYY : ");
        year = scanner.nextInt();
        System.out.println("Enter Salary / Month : ");
        salary = scanner.nextInt();
        
        // Age Calculator
        LocalDate DOB = LocalDate.of(year,month,date);
        LocalDate current_date = LocalDate.now();
        long age = ChronoUnit.YEARS.between(DOB, current_date);

        int annual_Salary = salary * 12;

        System.out.println("======================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Annual Salary: " + annual_Salary);

        float tax;
        if (annual_Salary >= 500000) {
            tax = (annual_Salary * 20) / 100;
            System.out.println("Tax: " + tax);
        } else if (annual_Salary >= 400000 && annual_Salary < 500000) {
            tax = (annual_Salary * 15) / 100;
            System.out.println("Tax: " + tax);
        } else if (annual_Salary >= 300000 && annual_Salary < 400000) {
            tax = (annual_Salary * 10) / 100;
            System.out.println("Tax: " + tax);
        } else if (annual_Salary >= 200000 && annual_Salary < 300000) {
            tax = (annual_Salary * 5) / 100;
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No Tax");
        }
        
    }
}