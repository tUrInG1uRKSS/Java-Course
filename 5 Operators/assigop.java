class assigop
{
    public static void main(String args[])
    {   
        int num = 7;
        // int num2 = 5; 

        // int result = num % num2; 

        // Similiar operations
        // num = num + 1;
        // num += 1;      // also works with other operators
        // num++;         // post - increment
        // ++num;            // pre - increment
        // num--;

        int result = num++; // fetch value then increment
        // int result = ++num; //increment then fetch value

        System.out.println(result);
    }
}