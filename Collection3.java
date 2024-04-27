import java.util.ArrayDeque;

public class Collection3 {
    public static void main(String[] args) {
        ArrayDeque Ad1 =new ArrayDeque();
        Ad1.add(100);
        Ad1.add(200);
        Ad1.add(300);
        System.out.println(Ad1);
        Ad1.addFirst('j');
        Ad1.addLast('p');
        System.out.println(Ad1);
        Ad1.offer(500);
        System.out.println(Ad1);
        Ad1.offerLast(550);
        Ad1.offerFirst(150);
        
        System.out.println(Ad1);
    }
    
}
