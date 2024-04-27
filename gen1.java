import java.util.*;
public class gen1 {
    public static void main(String[] args) {
        // typesafety ensured by array
        String ar[]=new String[10];
        ar[1]="Mayank";
        ar[2]="Aman";
        //ar[3]=10;
        ArrayList al=new ArrayList();
        al.add("Mayank");
        al.add("Aman");
        al.add(10);
        String e=(String)al.get(0);//typecasting
        String e1=(String)al.get(1);
        //String e2=(String)al.get(2);// got ClassCastException
        //typesafety achieved using generics
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("Mayank");
        //al1.add(10);//got error only string object are allowed
        String obj=al1.get(0);//no required of typecasting while fetching the data

        



    
        


    }
    
}
