abstract class Car
{
    public abstract void drive(); // must be in abstract class
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("play music");
    }
}

abstract class WagonR extends Car
{
    public void drive() // compulsory to define abstract method
    {
        System.out.println("Driving...");
    }
} 

class UpdatedWagonR extends WagonR // concrete class
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}

public class Demo31 
{
    public static void main(String a[])
    {
        Car obj = new UpdatedWagonR(); // can't create abstract object
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
    
}
