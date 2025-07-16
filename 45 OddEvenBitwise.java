import java.util.Scanner;

class OddEvenBitwise {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to OddEven Bitwise operator\n");

        System.out.print("Enter your number: ");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.print("\nYour number is Odd");
        } else {
            System.out.print("\nYour number is Even");
        }


    }
}
