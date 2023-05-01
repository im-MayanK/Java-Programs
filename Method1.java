import java.util.Scanner;
class calc
{
    // void add(int a, int b)
    // {
    //     int c=a+b;
    //     System.out.println(c);
    // }
    //without return statement
    

    int add(int a, int b)
    {
        int c=a+b;
        return c;
    } // with return statment

}


public class Method1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        calc c= new calc();
      
        int a,b;
        System.out.println("Enter the value of firt no.");
         a = scan.nextInt();
         System.out.println("Enter the value of Second no.");
         b = scan.nextInt();

       int d= c.add(a,b);
       System.out.println(d);

        
    }


    
}
