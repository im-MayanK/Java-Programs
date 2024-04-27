import java.util.HashMap;
import java.util.WeakHashMap;

class world1{
    private String name;
    private int age;
    world1(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return age+"";

    }
    @Override
    public void finalize()
    {
        
        System.out.println("clean up work by GC before deallocating  memory from heap");

    }

    

}
// hashmap vs weak hashmap
public class Map5 {
    public static void main(String[] args) {
        world1 obj =new world1("Mayank",20);
        // HashMap hm=new HashMap();
        // hm.put(obj,"Mayank");
        // System.out.println(hm);
        // obj=null;
        // System.gc();
        // System.out.println(hm);
        WeakHashMap hm=new WeakHashMap();
        hm.put(obj,"Mayank");
        System.out.println(hm);
        obj=null;
        System.gc();
        System.out.println(hm);

        System.out.println("last line");
        

        
    }
    
}

