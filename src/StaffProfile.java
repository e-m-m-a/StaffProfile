import java.util.Scanner;  // Import the Scanner class
public class StaffProfile {
    public static void main(String[] args){
//name, age,salary
        Scanner object = new Scanner(System.in);
        System.out.println("Enter staff name and and salary");

        System.out.println("Enter staff name : ");
        String name = object.nextLine();

        System.out.println("Enter staff age : ");
        int age = object.nextInt();

        System.out.println("Enter staff salary : ");
        double salary = object.nextDouble();

        System.out.println("name is " + name);
        System.out.println("name is " + age);
        System.out.println("name is " + salary);



    }
}