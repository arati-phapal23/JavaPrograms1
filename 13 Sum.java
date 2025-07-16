import java.util.Scanner;

 class Sum {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.print("Please enter first number: ");
        int FirstNum = input.nextInt();
        System.out.print("Now, please enter second number: ");
        int SecondNum = input.nextInt();

        int sum = FirstNum + SecondNum;

        System.out.print("Sum of your numbers is: " + sum );





    }
}
