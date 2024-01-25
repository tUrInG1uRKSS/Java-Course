// class A 
// {
//     int age;

//     public void show()
//     {
//         System.out.println("in A show");
//     }

//     static class B 
//     {
//         public void config()
//         {
//             System.out.println("in config");
//         }
//     }
// }

abstract class A 
{
    public abstract void show();
    public abstract void config();
}

public class Demo32 
{
    public static void main(String a[])
    {
        // Anonymous Inner Class
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in new show");
            }
            public void config()
            {
                System.out.println("in config");
            }
        };
        obj.show();

        // Inner Class
        // if B is non-static
        // A.B obj1 = obj.new B();
        // obj1.config();

        // if B is static
        // A.B obj1 = new A.B();
        // obj1.config();

    }    
}
