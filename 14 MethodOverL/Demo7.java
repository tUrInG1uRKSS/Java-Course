class Calculator
{
    // Method Overloading
    // different parameters (quantity and types)
    // doesn't matter type of return value
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}

public class Demo7
{
    public static void main(String[] args) 
    {
        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);
        int r2 = obj.add(4, 5, 6);
        double r3 = obj.add((float) r1, r2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
} 