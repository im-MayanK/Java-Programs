class demo1{
    static int a;
    static int b;

    int m;
    int n;
    static {
        a=10;
        b=20;
        System.out.println("Control in static block");
    }
    {
        m=100;
        n=200;
        System.out.println("Control in non static block");
    }
    static void disp1()
    {
        System.out.println("Value of static variable"+ a);
        System.out.println("Value of static variable"+ b);
        
    }
    void disp2()
    {
        System.out.println("value of non static variable" + m);
        System.out.println("value of non static variable" + n);
    }


}
public class launchstatic3 {
    public static void main(String[] args) {
        demo1 sp= new demo1();
        demo1.disp1();
        sp.disp2();
        
    }
    
}
