import java.util.Scanner;

class BitwiseOR {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise OR Operator\n");

        System.out.print("Please, enter first number: ");
        int first = input.nextInt();

        System.out.print("\nEnter the second number: ");
        int second = input.nextInt();

        int result = first | second;
        System.out.print("\nResult is: " + result);
    }
}
