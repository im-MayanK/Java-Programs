import java.util.*;
public class Collection2 {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(300);
        // System.out.println(ll1.get(1));
        // System.out.println(ll1);
        // ll1.add(1,400);
        // System.out.println(ll1.get(2));
        // System.out.println(ll1);
        // LinkedList ll2=new LinkedList();
        // ll2.add('j');
        // ll2.add("mayank");
        // ll2.add(55);
        // ll2.add(1.2);
        // System.out.println(ll2);
        // ll2.addFirst(100);
        // ll2.addLast(500);
        // System.out.println(ll2);
        // System.out.println(ll2.peek());
        // System.out.println(ll2);
        // System.out.println(ll2.poll());
        // System.out.println(ll2);
        System.out.println(ll1.indexOf(200));
        System.out.println(ll1.lastIndexOf(300));
        ll1.push(10);
        System.out.println(ll1);
        ll1.push(20);
        System.out.println(ll1);
        System.out.println(ll1.pop());


    }
    
}
