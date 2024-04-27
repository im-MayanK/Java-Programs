import java.util.*;
class Gen<T>{
    T obj;
    String str;
    Gen(T obj)
    {
        this.obj=obj;
    }
    Gen(String str)
    {
        this.str=str;
        System.out.println("string constructor called");
    }
    void disp()
    {   try{
         System.out.println("the type of data is"+ obj.getClass().getName());

       }
    catch (Exception e){
        System.out.println("the type of data is"+ str.getClass().getName());



    }
       
    }
    T getobj()
    {
        return obj;
    }




}

public class gen3 {
    public static void main(String[] args) {
        // Gen obj1=new Gen("Mayank");
        // System.out.println(obj1.getobj());
        Gen <Integer>obj1=new Gen<Integer>(10);
        System.out.println(obj1.getobj());
        obj1.disp();
        System.out.println("*******************");
        Gen <String>obj2=new Gen<String>("Mayank");
        System.out.println(obj2.getobj());
        obj2.disp();
        Gen obj3=new Gen("Mayank");
        obj3.disp();
       // ArrayList <Gen> ar=new ArrayList<Gen>();
    //    // ArrayList<Object> ar=new ArrayList<Integer>();
    //     List<Integer> ar=new ArrayList<Integer>();
    //    Collection<String> co=new ArrayList<String>();
    //    Gen<String> obj=new Gen<String>("Mayank");
    //    List<int> ll=new List<int>();// h=genirics mai primitive type nhi likh sakte
       
        
    }
    
}
