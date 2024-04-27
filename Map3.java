import java.util.*;
import java.util.Map.*;

class Data1
{
   
    private String name;
    private int age;
    private String place;
    Data1(String name, int age, String place){
        this.name=name;
        this.age=age;
        this.place=place;  
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPlace() {
        return place;
    }
    public String toString()
    {
        return name+ " "+ age+" " +place;
    }
    

}
public class Map3 {
    public static void main(String[] args) {
        Map map=new HashMap();
        Data1 sc1=new Data1("Mayank",20,"Gwalior");
         Data1 sc2=new Data1("Aman",28,"Pune");
          Data1 sc3=new Data1("Shikha",26,"Bengaluru");
          System.out.println(sc1);
        map.put(1,sc1);
        map.put(2,sc2);
        map.put(3,sc3);
        System.out.println(map);
        Set entryset = map.entrySet();
      
        Iterator itr=entryset.iterator();
        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            //Object e=itr.next();
            Map.Entry e=(Entry)itr.next();
            System.out.println(e.getKey()+" "+ ":"+ e.getValue()); 
        }

        
    }
    
}
