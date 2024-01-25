interface Computer
{
    public abstract void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run : Faster");
    }
}

class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class Demo33 
{
    public static void main(String a[]) 
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer leo = new Developer();
        leo.devApp(desk);
        leo.devApp(lap);
    }
}
