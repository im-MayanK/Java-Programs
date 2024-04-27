import java.util.*;
import java.util.Map.*;

//import javax.swing.RowFilter.Entry;
public class Map2 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(1, "mayank");//entry
        hm.put(2, "Aman");
        hm.put(3,"Shikha");
        System.out.println(hm);
        System.out.println(hm.get(3));//specific access
        System.out.println(hm.keySet());
        
         Set Keyset= hm.keySet();// return keys
        Iterator itr1=Keyset.iterator();
        
        
        while(itr1.hasNext())
        {
            //System.out.println(itr1.next());
            Integer Key=(Integer)itr1.next();
            System.out.println(Key);
        }
        Collection val=hm.values(); // return values
        Iterator itr2=val.iterator();
        while(itr2.hasNext())
        {
            //System.out.println(itr2.next());
            String value=(String)itr2.next();
            System.out.println(value);
        }
        Set entryset=hm.entrySet();
        Iterator itr3=entryset.iterator();
        while(itr3.hasNext())
        {
            //System.out.println(itr3.next());
            Map.Entry data=(Entry)itr3.next();
            System.out.println(data.getKey() + "="+ data.getValue());
        }
    }
    
}
