package Day_4_Assignment;
import java.util.Scanner;

// Questions 1:
public class Avenger {
    Scanner sc=new Scanner(System.in);
    
    String name;
    int age;
    int power;
    String weapon;
    String planet;

    public void getDetails() {
        System.out.println("Enter the Name");
        name=sc.next();
        System.out.println("Enter the Age");
        age=sc.nextInt();
        System.out.println("Enter the Power");
        power=sc.nextInt();
        System.out.println("Enter the Weapon");
        weapon=sc.next();
        System.out.println("Enter the Planet");
        planet=sc.next();
        

    }

    public void displayDetails() {
        System.out.println("Name: "+name+" Age: "+age+ " Power: "+power+ " Weapon: "+weapon+" Planet: "+planet+".");
    }
}