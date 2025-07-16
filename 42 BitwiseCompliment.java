import java.util.Scanner;

class BitwiseCompliment {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Showcasing of Not/Compliment operator\n");

        System.out.print("Please, enter the number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.print("\nYour result is: " + result);

    }

}
