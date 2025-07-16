import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Triangle's Area Calculator\n");

        System.out.print("Please, enter value of base in cms: ");
        double base = input.nextDouble();

        System.out.print("Now, enter your perpendicular height: ");
        double height = input.nextDouble();

        double area = (base * height) / 2;
        //double area = 0.5 * base * height;

        System.out.println("\nThe area of your triangle is: " + area + "cms2");







     }
}
