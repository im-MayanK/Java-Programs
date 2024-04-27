import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(01, "mayank");
        hm.put(02, "Aman");
        hm.put(03,"Shikha");
        
        System.out.println(hm);
        HashMap hm1=new HashMap();
        hm1.put("Agrawal", "mayank");
        hm1.put("krish", "Aman");
        hm1.put("jadu","Shikha");
        System.out.println(hm1);
        LinkedHashMap lh=new LinkedHashMap();
        lh.put("Agrawal", "mayank");
        lh.put("krish", "Aman");
        lh.put("jadu","Shikha");
        System.out.println(lh);
        hm1.put("Agrawal", "mayank");
        hm1.put("krish", "Aman");
        hm1.put("jadu","Shikha");
    
        

        
    }
    
}
