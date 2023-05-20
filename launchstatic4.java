import java.util.Scanner;



class farmer
{
    int pa;
    float ti;
    static float ra;
    static{
        ra= 8.5f; 
    }
    float si;
    Scanner scan = new Scanner(System.in);
     void disp()
    {
        System.out.println("Farmer enter the loan value");

        pa=scan.nextInt();
        System.out.println("Enter the time duration");
        ti=scan.nextFloat(); 
    }
    void compute()
    {
        si= (pa*ra*ti)/100f;
    }
    void result()
    {
        System.out.println("Your interest amout wil be" + si);
    }

}

public class launchstatic4 {
   
    public static void main(String[] args) {
        farmer loan1= new farmer();
        loan1.disp();
        loan1.compute();
        loan1.result();
        farmer loan2= new farmer();
        loan2.disp();
        loan2.compute();
        loan2.result();
       
        
    }
    
}
