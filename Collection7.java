import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection7 {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(100);
        System.out.println(ar);
        // for(int i=0;i<ar.size();i++)
        // {
        //     // Object e=ar.get(i);
        //     // System.out.println(e);
        //     System.out.println(ar.get(i));
        // }
        // for (Object i:ar)
        // {
        //    System.out.println(i);
        // }
        // Iterator itr=  ar.iterator();
        // while(itr.hasNext())
        // {
        //     // Integer e=(Integer)itr.next();
        //     // System.out.println(e);
        //     System.out.println(itr.next());
        // }
        ListIterator litr =ar.listIterator(ar.size());
        while(litr.hasPrevious())
        {
              System.out.println(litr.previous());
        }
        
    }
    
}
