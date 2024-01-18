public class Demo9
{
    public static void main(String[] args) 
    {
        // Creation of arrays
        // int nums[] = {3, 7, 2, 4};
        // int nums[] = new int[4]; // by default all the values are 0
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for(int i = 0; i < 4; i++)
        // {
        //     System.out.println(nums[i]);
        // }        

        // MULTIDIMENSIONAL ARRAY
        // int nums[][] = new int[3][4];

        // for(int i = 0; i < 3; i++)
        // {
        //     for(int j = 0; j < 4; j++)
        //     {
        //         nums[i][j] = (int) (Math.random() * 10);
        //     }
        // }

        // for(int i = 0; i < 3; i++)
        // {
        //     for(int j = 0; j < 4; j++)
        //     {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int n[] : nums) // Enhanced for loop
        // {
        //     for(int m : n)
        //     {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        // JAGGED ARRAY
        int nums[][] = new int[3][]; // jagged

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for(int n[] : nums) // no need to specify length
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // 3D ARRAY
        // int nums[][][] = new int[3][4][5];  
    }
}