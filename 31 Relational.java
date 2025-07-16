import java.util.Scanner;

class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving Licence Portal\n");
        System.out.print("Please, enter your age: ");

        int age = input.nextInt();

        //< > = == >= <=  - Relational Operators
        if (age >= 18) {
            System.out.println("\nYou are eligible to drive");

        } else {
            System.out.println("\nBeta Cycle chalao");
        }

    }
}
