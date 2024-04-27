public class ternary {
    public static void main(String[] args) {
        // int a=10;
        // int b=20;
        // int result = (a>b)? a :b ;
        // System.out.println(result);
        // String result1 = (a>b)? "a is greater": "b is greater";
        // System.out.println(result1);

        
        // check no. max in 3 no.s using ternary operator

        // int a=50;
        // int b=70;
        // int c=30;
        
        // String result =(a>b)? (a>c)? " a is greater" :"c is greater" : (b>c)? "b is greater" :"c is greater";
        // System.out.println(result);

        // check no. max in 3 no.s using ternary operator withour string

        int a=50;
        int b=70;
        int c=30;

        int result = (a>b)? (a>c? a:c): (b>c? b:c);
        System.out.println(result);






       


     
   

   
    }
    
}
