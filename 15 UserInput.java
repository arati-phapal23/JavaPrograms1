import java.util.Scanner;

 class UserInput {

    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Please Enter your name:");
        String name  = scanner.nextLine();

        System.out.println("Welcome\t" + name);
        Scanner input = new Scanner(System.in);
        System.out.print(name + ",Also tell me your age:");
        int age = input.nextInt();

        System.out.println("Your age is: " + age);




    }
}