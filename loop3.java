import java.util.Scanner;
public class loop3 {
    public static void main(String[] args) {
        int b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value");
        int a= scan.nextInt();
        while(a>0)
        {
           
           b= a%10;
           a=a/10;

           System.out.print(b);

        }
     
    }
    
}
