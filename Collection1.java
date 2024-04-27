import java.util.*;
public class Collection1 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        //System.out.println(al1.add(200));
        al1.add(200);
        al1.add(300);
        al1.add(400);
        System.out.println(al1);
        al1.add(2,500);
    
        System.out.println(al1.get(2));
        System.out.println(al1);
        // System.out.println(al1.contains(200));;
        // System.out.println(al1.indexOf(300));
        // System.out.println(al1.size());
        // al1.ensureCapacity(10);
        // al1.trimToSize();
        // System.out.println(al1.size());
        // al1.clear();
        // System.out.println(al1);
        
        // ArrayList al2=new ArrayList();
        // al2.add("Mayank");
        // al2.add(500);
        // al2.add('j');
        // al2.add(1.4);
        // System.out.println(al2);
        // ArrayList al3=new ArrayList();
        // al3.add(100);
        // al3.add(500);
        // //al3.add(al2);
        // al3.addAll(al2);
        // System.out.println(al3);
        // al3.add(2,200);
        // System.out.println(al3);
        // al3.addAll(1,al1);
        // System.out.println(al3);
        
    }
    
}

