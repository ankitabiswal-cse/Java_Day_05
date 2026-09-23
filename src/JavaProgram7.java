import javax.print.DocFlavor;
import java.util.*;
public class JavaProgram7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();

        int avg =(a+b+c)/3;

        System.out.println("The Avg Number Of Three Number is ="+avg);
    }
}
