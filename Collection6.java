import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collection6 {
    public static void main(String[] args) {
        HashSet hs =new HashSet();
        hs.add(100);
        hs.add(50);
        hs.add(30);
        hs.add(75);
        hs.add(75);
        hs.add(0);
        System.out.println(hs);
        LinkedHashSet lh=new LinkedHashSet();
        lh.add(100);
        lh.add(50);
        lh.add(30);
        lh.add(75);
        System.out.println(lh);
    }
    
}
