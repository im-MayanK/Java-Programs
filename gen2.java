import java.util.ArrayList;

class MissWorld
{
    private int beauty=10;
    private String name="ankit";
   public String toString()
   {
    return name;
   }

}
class MissIndia
{
    private int beauty;
    private String name;

}
public class gen2 {
    public static void main(String[] args) {
        MissWorld mw=new MissWorld();
        MissWorld mw2=new MissWorld();
        MissIndia mi=new MissIndia();
        ArrayList<MissWorld> al=new ArrayList<MissWorld>();
        al.add(mw);
        al.add(mw2);
        al.add(mi);//got error typesafety achieved only MissWorld type object is allowed
        MissWorld e=(MissWorld)al.get(2);
        System.out.println(al.get(2));
                


        
    }
    
}
