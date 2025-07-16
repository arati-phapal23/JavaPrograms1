import java.util.Scanner;

class FahrenheitToCelsius {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Temperature Converter\n");
        System.out.print("Enter your Temp in F: ");

        float fah = input.nextFloat();
        float cel = (fah - 32) * 5 / 9;
        //float cel = (fah - 32) * 5.0f / 9.0f;
        System.out.println("\nYour Temperature is: " + cel + "C");



    }
}
