import java.util.*;
public class JavaProgram3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rectangle Length: ");
        int l = sc.nextInt();

        System.out.print("Enter Rectangle Breadth: ");
        int b = sc.nextInt();

        int area = l*b;
        System.out.println("Rectangle Area="+area);
    }
}
