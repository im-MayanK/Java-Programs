public class array {
    public static void main(String[] args) {
    // int a[]={34,54,43,12,};   
    // for (int i=0;i<=3;i++)
    // {
    //     System.out.println(a[i]);
    // }   
    
    // int num[] =new int[13];
    // num[0]=34;
    // num[1]=54;
    // num[2]=43;
    // num[3]=12;

    // for (int i=0;i<=3;i++)
    // {
    //     System.out.println(num[i]);
    // }   

    // String names[]={"Mayank","Aman","Shikha"};
    // for (int i=0;i<=2;i++)
    // {
    //     System.out.println(names[i]);
    // }   


    // 2-d Array

    //   int num[][] = new int[3][2];
    //   num[0][0]=4;
    //   num[0][1]=2;
    //   num[1][0]=3;
    //   num[1][1]=5;
    //   num[2][0]=1;
    //   num[2][1]=6;

    // for (int i=0;i<=2;i++)
    // {
    //   for (int j=0;j<=1;j++)
    //   {
    //       System.out.print(num[i][j]);
    //   }
    //   System.out.println();
    // }

    // if values are given 
       
    //  int num[][]={  {4,2} , {3,5}
    //                             ,{1,6} };


    // learn about jagged array

    // when values are given
    // int num[][]={{4,2,3,5},
    //                  {5,4},
    //                  {3,2,1}};
    
    // for (int i=0;i<=2;i++)
    // {
    //   for (int j=0;j<num[i].length;j++)
    //   {
    //       System.out.print(num[i][j]);
    //   }
    //   System.out.println();
    // }

    // when values are not given

    int num[][]= new int [3][];
    num[0]= new int[4];
    num[1]= new int[2];
    num[2]= new int[3];

         num[0][0]=4;
      num[0][1]=2;
      num[0][2]=4;
      num[0][3]=2;
      num[1][0]=4;
      num[1][1]=2;
      num[2][0]=5;
      num[2][1]=1;
      num[2][2]=6;

      for (int i=0;i<=2;i++)
      {
        for (int j=0;j<num[i].length;j++)
        {
            System.out.print(num[i][j]);
        }
        System.out.println();
      }
      
     



    }
    
}
