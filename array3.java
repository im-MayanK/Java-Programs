// Anonymns array

class wow
{
    int result=0;
    int add(int num[])
    {
         for(int n:num)
         {
            result=result+n;
         }
      return result;
    }
}
public class array3 {
    public static void main(String[] args) {
        
   wow obj=new wow();
   int result=obj.add(new int []{5,4,3,2,1});
   System.out.println(result);
    }

    
}


// array index bound of exception  can be solved by enchance loop or by length property

//Write a program to reverse the array





