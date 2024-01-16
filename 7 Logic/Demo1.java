class Demo1
{
    public static void main(String[] args) {   
        
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        // Typical: &(and) |(or) !(not)
        // Short circui: && || !
        // boolean result = x > y && a < b ;
        // boolean result = x < y || a < b || a > 1;
        boolean result = a > b;
        
        System.out.println(!result);
    }
}