class A 
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }

    static class B 
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}

public class Demo32 
{
    public static void main(String a[])
    {
        A obj = new A();
        obj.show();

        // if B is non-static
        // A.B obj1 = obj.new B();
        // obj1.config();

        // if B is static
        A.B obj1 = new A.B();
        obj1.config();

    }    
}
