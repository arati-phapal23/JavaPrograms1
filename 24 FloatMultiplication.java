import java.util.Scanner;

class FloatMultiplication {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
         System.out.println("We are doing Float Multiplication\n");
         System.out.print("Please enter first decimal number: ");

          double first = input.nextDouble();
          System.out.print("Now, Please enter second number: ");
          double second = input.nextDouble();

          double mul = first * second;
          System.out.println("\nResult is: " + mul );
          System.out.println("\nResult is: " + (first + second));









    }

}
