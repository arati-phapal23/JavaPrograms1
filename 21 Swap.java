import java.util.Scanner;

class Swap {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to swapping station");
        System.out.print("Enter value of A: ");
        int a = input.nextInt();
        System.out.print("Enter value of B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Swapping done\n");
        System.out.println("Enter value of A:" + a);
        System.out.println("Enter value of B:" + b);




        





    }

}
