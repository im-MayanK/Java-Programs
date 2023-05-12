import java.util.Scanner;
public class array4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no. of values you want in the arrays");
        int i = scan.nextInt();
        int num[]=new int[i];
        for (int a=0; a<i ; a++)
        {
            System.out.println("enter the " +a + " position value in the array ");
             num[a] =scan.nextInt();
        }
        System.out.print("your values in the array are =");
        for(int n :num) 
        {
            System.out.print(n);
        }
        System.out.println("Now your reversed array is =");
        for (int b = num.length -1; b>=0;b--)
        {
            System.out.println(num[b]);
        }
       
        

        
    }
}

    // array practice questions


    

