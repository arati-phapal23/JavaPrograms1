import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Age Calculator\n");

        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        
        // Using if-else Condition
        if (age >= 60) {
            System.out.println("\nYou are a Senior Citizen");

        } else if (age <= 60) {
            System.out.println("\nYou are an Adult Person");

        } else if (age <= 20 ) {
            System.out.println("\nYou are a Teenager");

        } else  {
            System.out.println("\nYou are a Child");
        }
    }
}
