import java.util.Scanner;
class calc
{
    void add(double a, double b)
    {
        double c=a+b;
        System.out.println(c);
       
    }
    void sub(double a, double b)
    {
        double c=a-b;
        System.out.println(c);
    }
    void mul(double a, double b)
    {
        double c=a*b;
        System.out.println(c);
    }
    void divide(double a, double b)
    {
        double c=a/b;
        System.out.println(c);
    }
}

public class Method2 {

   

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        calc c= new calc();
      
        double a,b;
        System.out.println("CALCULATOR");
        System.out.println("Enter the value of firt no.");
         a = scan.nextDouble();
         System.out.println("Enter the value of Second no.");
         b = scan.nextDouble();
         System.out.println("which operation u want to perform with this calculator");
         System.out.println("1->  + add operation");
         System.out.println("2->  - sub operation");
         System.out.println("3->  *mul operation");
         System.out.println("4->  / divide operation");
         int d =scan.nextInt();
         switch(d){
           case(1):
            c.add(a,b);
            break;
            case(2):
            c.sub(a,b);
            break;
            case(3):
            c.mul(a,b);
            break;
            case(4):
            c.divide(a,b);
            break;
            default :
            System.out.println("You enter the wrong input");

           }
        }


        
       
        
    }


    


    
