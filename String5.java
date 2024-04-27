import java.util.Arrays;

public class String5 {
    public static void main(String[] args) {
        // anagram program
        String str1= "School Master";
        String str2= "The Classroom ";
        str1=str1.replace(" ", "");
        str2=str2.replace(" ","");

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        // for (char n: arr2)
        // {
        // System.out.println(n);  // for understanding how it works
        // }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // for (char n: arr2)
        // {
        // System.out.println(n);
        // }

        if (Arrays.equals(arr1,arr2))
        {
            System.out.println("is is an anagram");
        }
        else{
            System.out.println("it is not an anagram");
        }


    }
    
}
