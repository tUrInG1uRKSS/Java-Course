// final - variable, method, class

class Calc // final class stops inheritance
{
    public final void show() // can not override
    {
        System.out.println("By Marco");
    }
    public void add(int a, int b)
    {
        System.out.println(a + b);
    }
}
class AdvCalc extends Calc
{
    // public void show()
    // {
    //     System.out.println("By Leandro");
    // }
}

public class Demo28 
{
    public static void main(String a[])
    {
        // final variable
        // final int num = 8; // final = constant
        // num = 9;
        // System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(4, 5);
    }    
}
