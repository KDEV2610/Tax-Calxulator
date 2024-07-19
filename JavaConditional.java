import java.util.*;

public class JavaConditional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter your age :");
//        int age = s.nextInt();
////        int age = 16;
//        if (age >= 18){
//            System.out.println("Adult : Vote, Drive");
//        }
//
//        else if(age >= 13 && age <= 16){
//            System.out.println("Teenager");
//        }
//
//        else{
//            System.out.println("Not adult");
//        }

//        int a =100;
//        int b =18;
//
//        if(a >= b){
//            System.out.println("a is largest of 2");
//        }
//        else{
//            System.out.println("b is largest of 2");
//        }

//        System.out.print("Enter Num to check that num is even or odd :");
//        float num = s.nextFloat();
//
//        if(num % 2 == 0){
//            System.out.println("Num is even");
//        }
//        else {
//            System.out.println("Num is odd");
//        }
//********TAX CALCULATOR******
        System.out.print("Enter your salary per annum :");
        int Income = s.nextInt();
        int tax = 0;

        if(Income <= 300000){
            System.out.println("No tax");
        }
        else if (Income >= 300000 && Income < 600000) {
            tax = (int) (Income*0.05);
        }
        else if (Income >= 600000 && Income < 900000) {
            tax = (int) (Income*0.1);
        }
        else if (Income >= 900000 && Income < 1200000) {
            tax = (int) (Income*0.15);
        }
        else if (Income >= 1200000 && Income < 1500000) {
            tax = (int) (Income*0.2);
        }
        else{
            tax = (int) (Income*0.3);
        }
        System.out.println("Tax is : " + tax );
    }
}
