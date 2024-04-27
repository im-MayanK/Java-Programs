import java.util.*;

public class Map4 {

    public static void main(String[] args) {
        Hashtable ht =new Hashtable();
        Integer i= new Integer(3);
        ht.put(1,"Aman");
        ht.put(2,"Shikha");
        ht.put(5,"Mayank");
        ht.putIfAbsent(i, "Aman");
        System.out.println(ht);
        
        
      
        

        TreeMap tm=new TreeMap();  
        Integer p= new Integer(5);
        tm.put(p,"Aman");
        tm.put(3,"Mayank");
        tm.put(4,"Mummy");
        tm.put(1,"Shikha");
        System.out.println(tm);
        Set m=tm.entrySet();
        tm.keySet();
        Iterator itr=m.iterator();
        itr.hasNext();
        Object e=itr.next();
        System.out.println(e);
        // tm.putIfAbsent(2, m);
        // System.out.println(tm);

        
    }
    
}
