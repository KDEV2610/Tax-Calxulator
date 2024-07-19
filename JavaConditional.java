import java.util.*;

public class JavaConditional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
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
