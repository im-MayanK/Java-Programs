import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.*;



public class Collection8 {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(100);
        System.out.println(ar);
        // for (int i=0;i<ar.size();i++)
        // {
        //     System.out.println(ar.get(i));
        //     ar.add(200);
        // }
        // for(Object i:ar)
        // {
        //     System.out.println(i);

        // }
        try{
             Iterator itr = ar.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
            ar.add(200);
        }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
        // CopyOnWriteArrayList ar1=new CopyOnWriteArrayList();
        // ar1.add(10);
        // ar1.add(20);
        // ar1.add(30);
        // ar1.add(100);
        // System.out.println(ar);
        //  Iterator itr = ar1.iterator();
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        //     ar1.add(200);
        // }


        

    }
    
}
