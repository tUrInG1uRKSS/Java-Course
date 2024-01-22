// every class in Java extends "Object" class
class A extends Object
{
    public A()
    {
        super(); // constructor of Object class
        System.out.println("in A");
    }

    public A (int n)
    {
        super();
        System.out.println("in A int");
    }
}

class B extends A // inheritance
{
    public B()
    {
        // every constructor has a method
        super(); // even if is not here explicity
        // call the (default = unparameterized) constructor of the superclass
        System.out.println("in B");
    }

    public B(int n)
    {
        // super(n); // call the parameterized constructor of superclass
        this(); // execute the constructor of the same class
        System.out.println("in B int");
    }
    
} 

public class Demo14
{
    public static void main(String a[]) 
    {
        // call constructor of sub and super class
        // B obj = new B(5); // instantiating
          
    }
}