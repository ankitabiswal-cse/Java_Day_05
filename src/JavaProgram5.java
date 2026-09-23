import java.util.*;
public class JavaProgram5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        int c = sc.nextInt();

        int fahrenheit = (c*9/5)+32;
        System.out.println("Celsius Convert To Fahrenheit="+fahrenheit);
    }
}
