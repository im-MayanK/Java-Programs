import java.util.*;
public class LearnCollections {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(30);
        al.add(50);
        al.add(125);
        al.add(75);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
         ArrayList<String> al1=new ArrayList<String>();
        al1.add("Mayank");
        al1.add("Shikha");
        al1.add("Aman");
        al1.add("Somya");
        al1.add("Mummy");
        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);
            ArrayList al2=new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.add(50);
        System.out.println(al2);
        int index=Collections.binarySearch(al2,30);// binary search can be aply ifand only if the data is in 
        //sorted order and if the data is not present it give negative value
        System.out.println(index);
        Collections.rotate(al2, 2);
        System.out.println(al2);
        Collections.shuffle(al2);
        System.out.println(al2);
        System.out.println(Collections.frequency(al2,20));


    }
    
}
