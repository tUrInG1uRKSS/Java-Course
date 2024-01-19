class Calculator
{
    // Stack - Last In First Out
    // Heap - open space
    // every method has its own stack
    // local variables are part of the stack
    int num = 5; // instance variable

    public int add(int n1, int n2) 
    {
        // System.out.println(num);
        return n1 + n2; // n1, n2 are local variables
    }
}

public class Demo8
{
    public static void main(String[] args) 
    {
        // int data = 10; // stack - key and value

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        // int r1 = obj.add(3, 4);
        // System.out.println(r1);

        obj.num = 8; // is different from obj.num1 (another memory sapce)

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
} 