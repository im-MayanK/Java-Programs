import java.util.Scanner;
public class patternalphabet
{
public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
  
int n=11; 
System.out.println("Enter the char input in capital which you want to print from A to H");
char a= scan.next().charAt(0);

for (int i=0;i<n;i++)
{
    for (int j=0;j<n;j++)
    {
        switch (a){
            case 'A':
            
        if (i==0 && j>0 && j<(n-1)/2 || j==0 &&i>0 ||i==(n-1)/2 && j<= (n-1)/2||j==(n-1)/2 && i>0 )       
        {
            System.out.print("*");
        }
        else 
        {
            System.out.print(" ");
        } 
        break;

         case 'B':

         
        if (j==0|| i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 || i==(n-1) && j<(n-1)/2 || j==(n-1)/2 && i!=0 && i != (n-1)/2 && i!=(n-1))
        {
            System.out.print("*");
        }
        else 
        {
            System.out.print(" ");
        }
        break;

        case 'C':

        if (i==0 && (j>0 && j<(n-1)/2) || j==0 && i >0 && i< (n-1)|| i==n-1 && j>0 && j<(n-1)/2)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
                break;
        

        case 'D':
        if (i==0 && j<(n-1)/2 || i==n-1&& j<(n-1)/2 || j==0 || j==(n-1)/2 && i>0 && i<n-1)       
        {
            System.out.print("*");
        }
        else 
        {
            System.out.print(" ");
        } 

        break;

        case 'E':

        if (j==0 || i==0 ||i==(n-1)/2|| i==n-1 )          
        {
            System.out.print("*");
        }
        else 
        {
            System.out.print(" ");
        }
        break;

        case 'F':

        
        if (j==0 || i==0 ||i==(n-1)/2)          
        {
            System.out.print("*");
        }
        else 
        {
            System.out.print(" ");
        }
        break;

        case 'G':

        if (i==0 && (j>0 && j<(n-1)/2) || j==0 && i >0 && i< (n-1)|| i==n-1 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2 || 
        j== (n-1)/2 + (n-1)/4 && i >=(n-1)/2 || i== (n-1)/2 && j >= (n-1)/2 && j<= ((n-1)/2+(n-1)/4))
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
                break;
        


        case 'H':

        if (j==0 || i==(n-1)/2|| j==n-1 )          
        {
            System.out.print("*");
        }
        else 
        {
            System.out.print(" ");
        }
        break;



    }
}
    System.out.println("");
} 
    

}
}




