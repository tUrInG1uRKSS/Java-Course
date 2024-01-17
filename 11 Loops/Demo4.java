public class Demo4
{
    public static void main (String a[])
    {
        // LOOPS
        // repeat this statement 4 times
        // loop - while, do while, for (has types)
        // finite times - condition  

        // WHILE LOOP
        // int i = 1; // i = iterator
        // while(i <= 4)
        // {
        //     System.out.println("Hi " + i);
        //     i++;
        // }
        // System.out.println("Bye " + i);

        // NESTED WHILE LOOP    
        // while (i <= 4)
        // {
        //     System.out.println("Hi " + i);
        //     int j = 1;
        //     while (j <= 3) {
        //         System.out.println("Hello " + j);    
        //         j++; 
        //     }
        //     i++;
        // }
        // System.out.println("Bye " + i);

        // DO WHILE LOOP (at least once run)
        // do
        // {
        //     System.out.println("Hi " + i);
        //     i++;
        // }while (i <= 4);

        // FOR LOOP
        // for(int i = 0; i < 4; i++)
        // {
        //     System.out.println("Hi " + i);
        // }

        // NESTED FOR LOOP
        // for(int i = 1; i <= 5; i++)
        // {
        //     System.out.println("DAY " + i);
        //     for(int j = 1; j <= 9; j++)
        //     {
        //         System.out.println("    " + (j + 8) + " - " + (j + 9));
        //     }
        // }

        // ANOTHER WAY
        int i = 1;    
        for(;i <= 5;)
        {
            System.out.println("DAY " + i);
            i++;
        }
    }
}   