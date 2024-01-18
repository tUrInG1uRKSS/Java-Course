class Mobile
{
    String brand;
    int price;
    static String name; // common to all objects
    // static: member of the class / no of the object
    
    static // this block is only called once no -  matter # objects created
    {   
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile() // constructor
    {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    public void show() // in non static we can use static variables
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    // public static void show1(Mobile obj)
    // {
    //     // static method can't directly get access to non static variable
    //     // System.out.println(brand + " : " + price + " : " + name);
    //     // Indirectly:
    //     System.out.println(obj.brand + " : " + obj.price + " : " + name);
    // }
}

public class Demo12
{
    public static void main(String a[]) // main needs to be static
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; // call with class name

        Mobile obj2 = new Mobile();

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1700;

        // Mobile.name = "Phone";
        
        // obj1.show();
        // obj2.show();

        // Mobile.show1(obj1); // indirect call of instance variables
    }
}