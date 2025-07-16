import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Number Checker\n");
        System.out.print("Please, enter your number: ");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("\nYour number is Positive");

        } else if (num == 0){
            System.out.println("\nYour number is zero");

        } else {
            System.out.println("\nYour number is Negative");
        }



    }

}
