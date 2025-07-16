import java.util.Scanner;

class OddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to EvenOdd number Calculator\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("\nYour number is an Even Number");
        } else {
            System.out.println("\nYour number is an Odd Number");
        }

    }
}
