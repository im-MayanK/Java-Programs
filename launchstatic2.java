class Demo{
    static void disp()
    {
        System.out.println("iam a static method");
    }
    void disp2()
    {
        System.out.println(" iam non static method i need object reference to call");
    }
}
public class launchstatic2 {
   
    
    public static void main(String[] args) {
        Demo.disp();
        Demo a= new Demo();
        a.disp();
        a.disp2();

        
    }
    
}
