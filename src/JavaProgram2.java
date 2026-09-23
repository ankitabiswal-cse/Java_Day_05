import java.util.Scanner;
public class JavaProgram2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int multipication = a*b;
        System.out.println("Multipication ="+multipication);
    }
}
