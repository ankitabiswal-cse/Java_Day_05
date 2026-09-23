import java.util.*;
public class JavaProgram4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int p = sc.nextInt();

        System.out.print("Enter Rate: ");
        int r = sc.nextInt();

        System.out.print("Enter Time: ");
        int t = sc.nextInt();

        int simpleinterest  =(p*r*t)/100;
        System.out.println("Simple Interest ="+simpleinterest);
    }
}
