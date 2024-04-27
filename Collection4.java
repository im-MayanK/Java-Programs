import java.util.PriorityQueue;

public class Collection4 {
    public static void main(String[] args) {
        PriorityQueue pq =new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
         pq.add(15);
       
        System.out.println(pq);
        pq.add(25);
        System.out.println(pq);
         PriorityQueue pq1 =new PriorityQueue();
         pq1.add("pw");
         pq1.add("mayank");
         pq1.add("aman");
         pq1.add("mummy");
         pq1.add("ab");
         System.out.println(pq1);
    }
    
}
