import java.util.Scanner;

class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grading Calculator\n");

        System.out.print("Please, enter your percentage: ");
        float percentage = input.nextFloat();

        if (percentage >= 90) {
            System.out.println("\nGreat, you have got A Grade");

        } else if (percentage >= 75) {
            System.out.println("\nGood, you have got B Grade");

        } else if (percentage >= 60) {
            System.out.println("\nNice, you have got C Grade");

        } else if (percentage >= 30) {
            System.out.println("\nYou have got D Grade , you will have to study");

        } else if (percentage <= 30) {
            System.out.println("\nYou have got F Grade, you failed");
        }


    }
}
