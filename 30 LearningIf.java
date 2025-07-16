
class Main {

    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Bob";

        System.out.println("Before if");
        if (isMale) {
            System.out.println("Mr." + name);

        } else {
            System.out.println("Ms." + name);
        }
        System.out.println("After if");

        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;

//        if (isSeniorCitizen) {
//            System.out.println("\nHello Senior Citizen");
//        } else {
//            if (isAnAdult) {
//                System.out.println("\nHello Adult");
//            } else {
//                System.out.println("\nHello Child");
//            }
//
//        }

        if (isSeniorCitizen) {
            System.out.println("\nHello Senior Citizen");
        } else if (isAnAdult) {
                System.out.println("\nHello Adult");
        } else {
                System.out.println("\nHello Child");
        }

        }





    }
