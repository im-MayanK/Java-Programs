//learn about tostring() method in java
class Learn1 extends Object
{
    int rollno;
    String sname;
    Learn1(int rollno , String sname)
    {
        this.rollno =rollno;
        this.sname= sname;  
    }
    public String toString()
    {
        return rollno+ sname;
    }
    

}
public class String8 {
    public static void main(String[] args) {
        Learn1 obj=new Learn1(11,"mayank");
        // System.out.println(obj.rollno);    //...
        // System.out.println(obj.sname);    // instead of this 
       // System.out.println(obj.toString());
       System.out.println(obj);   // we did this
       

        
    }
    
}
