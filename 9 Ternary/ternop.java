public class ternop
{
    public static void main(String a[])
    {
        int n = 4;
        int m = 4;
        int result = 0;

        // if (n % 2 == 0)
        //     result = 10;
        // else   
        //     result = 20;
        
        // Ternary operator ?:
        // result = n % 2 == 0 ? 10 : 20;
        
        result = n > m ? 2 : n < m ? 1 : 0;

        System.out.println(result); 
    } 
}