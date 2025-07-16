import java.util.Scanner;

class LeftShift {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase Leftshift operator\n");

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.print("\nResult is: " + result);


    }
}
