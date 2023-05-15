import javax.swing.plaf.synth.SynthToolTipUI;

public class String1 {
    public static void main(String[] args) {
        // String name ="Mayank";
        // System.out.println(name);
        // name.concat("bengalore");
        // System.out.println(name);
        // StringBuilder name1 = new StringBuilder("Mayank");
        // System.out.println(name1);
        // name1.append(" bengalore");
        // System.out.println(name1);
           
   // understanding immutable concept of string

        String name= "mayank";
        String name1= "mayank";
        String name4= "MAYANK";
        String name2= new String("mayank");
        String name3= new String("MAYANK");
        System.out.println(name==name1);
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name1.equalsIgnoreCase(name3));
        System.out.println(name1.equalsIgnoreCase(name4));
        
        
    }
    
}
