import java.util.Scanner;

class Logical {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Ticket discount Counter\n");
        System.out.print("Please, enter your age: ");
        int age = input.nextInt();

        System.out.print("Are you a female? (True/false): ");
        Boolean isFemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("\nYou got 75% Discount");

        } else if (isFemale) {
            System.out.println("\nYou got 50% Discount");

        } else if (age > 60  && !isFemale) {
            System.out.println("\nYou got 25% Discount");

        } else {
            System.out.println("\nYou got No Discount");
        }

    }

}
