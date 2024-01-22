
class A
{
    public A()
    {
        System.out.println("Object created");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}

public class Demo16 
{
    public static void main(String a[])
    {
        new A(); // anonymous object
        new A().show(); // object can't be used again
    }
    
}
