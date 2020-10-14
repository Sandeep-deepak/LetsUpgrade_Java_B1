package Day_4_Assignment;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Questions 1:
        // create a class avenger with
        // properties (name,age,power,weapon,planet) and with
        // functions-getDetails() and displayDetails().
        // create 5 objects as an array in the main method and call.
        System.out.println("==================");
        System.out.println("Questions 1: ");
        System.out.println("==================");

        Avenger[] avengers = new Avenger[5];

        for(int i=0; i<5; i++){
            avengers[i] = new Avenger();
            avengers[i].getDetails();
        }

        for(int i=0;i<5;i++)
        {
            avengers[i].displayDetails();
        }

        // Questions 2:
        // Create an int array with 5 values and print only odd values.
        System.out.println("==================");
        System.out.println("Questions 2: ");
        System.out.println("==================");

        // datatype[] arrayName = new datatype[size];
        int[] arr = new int[5];
        arr[0]= 24;
        arr[1]= 69;
        arr[2]= 54;
        arr[3]= 31;
        arr[4]= 17;
        for(int i=0; i<5; i++){
            if(arr[i]%2 != 0){
                System.out.println(arr[i]);
            }
        }

        // Questions 3:
        // Create an int array of size 5, take all the values from the user, 
        // add all the values and print the sum.
        System.out.println("==================");
        System.out.println("Questions 3: ");
        System.out.println("==================");
        
        Scanner sca=new Scanner(System.in);
        
        int[] vals = new int[5];
        for(int i=0; i<5; i++){
            System.out.println("Enter a Number :");
            vals[i] = sca.nextInt();
        }

        int sum=0;
        for(int j=0; j<5; j++){
            int val = vals[j];
            sum+=val;          
        }  
        System.out.println("Sum of 5 Numbers is: "+ sum);

    }
}