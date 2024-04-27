public class launchstatic{

    static int age;
    static{
        age =18;
        System.out.println("First execute static block");
    }
      static void disp()
      {
        System.out.println("main method ke baad jab hum esse call karenge");
      }    
    
    
    public static void main(String[] args) {

        System.out.println("Second execute main method");
        disp();
        
    }
}

