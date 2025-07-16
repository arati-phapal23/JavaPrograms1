import java.util.Scanner;

class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("welcome to the New year Calculator\n");
        System.out.print("Please enter the year that you want to check: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("\nYour year is a Leap year");

        } else {
            System.out.println("\nYour year is not a Leap year");
        }
    }
}
