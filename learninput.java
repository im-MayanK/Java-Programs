import java.util.Scanner;
public class learninput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int a=scan.nextInt();
        System.out.println("Enter the second no.");
        int b=scan.nextInt();
        int sum=a+b;
        System.out.println("Your sum is = " + sum);
        
    }
    
}
