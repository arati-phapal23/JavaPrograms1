import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Welcome to Arithmetic Calculator\n");

        Scanner input = new Scanner (System.in);
        System.out.print("Please enter first number: ");
        int first = input.nextInt();

        System.out.print("now, please enter second number: ");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("\nAddition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Division is: " + div);
        System.out.println("Modulus is: " + mod);




        }
    }
