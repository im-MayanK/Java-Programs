class student1{   /// understanding about constructor overloading
    private String name;
    private int age;
student1()
{
   System.out.println("Zero paramaterized constructor is called");
}
student1(String name)
{
  this.name =name;
}
student1(String name,int age)
{
    this.name=name;
    this.age=age;
}
void show()
{
    System.out.println(name);
    System.out.println(age);
}

}
public class Constructor2 {
    public static void main(String[] args) {
        student1 st1=new student1();
        student1 st2=new student1("Mayank");
        st2.show();
        student1 st3=new student1("Aman",26);
        st3.show();
        
    }
    
}
