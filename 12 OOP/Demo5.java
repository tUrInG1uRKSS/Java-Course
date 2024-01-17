//Object Oriented Programming
// Object - Properties (knows) and Behaviours (does)

// Class (designed by the programmer)
// JVM creates objects (manufacturing)
// Java is statically type language

// Primitive and Reference variable

class Calculator
{
    int a;

    public int add(int n1, int n2)
    {
        // System.out.println("in add");
        int r = n1 + n2;
        return r;
    }
}

public class Demo5 
{
    public static void main(String[] args) 
    {
        int num1 = 4;
        int num2 = 5;

        // Calculator calc; // reference
        Calculator calc = new Calculator(); // creation of object
        int result = calc.add(num1,num2);
        System.out.println(result);
    }
} 