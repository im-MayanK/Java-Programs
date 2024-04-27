import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;
public class nestedloop {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        System.out.println("Enter the input ");
        int n= star.nextInt();
        for (int j=0;j<n;j++)
        {
            for (int i=0;i<n;i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("this is your "+ n +"*" + n +" star box" );
    }
    
    
}
