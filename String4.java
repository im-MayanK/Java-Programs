public class String4 {
    public static void main(String[] args) {
        // some string reverse java programs
        // Case 1
        // String str1="Mayank Agrawal";
        // String str2="";
        // for(int i=str1.length()-1;  i>=0 ;i--)
        // {
        //     str2=str2 + str1.charAt(i);
        // }
        // System.out.println("Before Reversing=" + str1);
        // System.out.println("After Reversing=" + str2);

        // case 2

        // String str1="Mayank Agrawal";
        // String str2="";
        // String arr[] = str1.split(" ");
        
        // for(int i= arr.length -1;  i>=0 ;i--)
        // {
        //     str2=str2 + arr[i] + " ";
        // }
        // System.out.println("Before Reversing=" + str1);
        // System.out.println("After Reversing=" + str2);

        //case 3

        // String str1="Mayank Agrawal";
        // String str2="";
        // String arr[] = str1.split(" ");
        // for (String result : arr)
        // {
            
        //  for(int i= result.length() -1;  i>=0 ;i--)
        //   {
        //     str2=str2 + result.charAt(i);
        //   }
        //   str2= str2 + " ";
        // }
       
        // System.out.println("Before Reversing=" + str1);
        // System.out.println("After Reversing=" + str2);

        // palindrome program
        String str1= "MADAM";
        String str2= "";
        for (int i= str1.length()-1; i>=0; i--)
        {
            str2=str2+ str1.charAt(i);
        }
        if (str1.equals(str2))
        {
            System.out.println("IT is palindrome");
        }
        else 
        {
            System.out.println("no it is not palindrome");
        }

         
    }
    
}
