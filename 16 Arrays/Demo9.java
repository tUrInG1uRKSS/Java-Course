public class Demo9
{
    public static void main(String[] args) 
    {
        // int nums[] = {3, 7, 2, 4};
        int nums[] = new int[4]; // by default all the values are 0
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        for(int i = 0; i < 4; i++)
        {
            System.out.println(nums[i]);
        }        
    }
}