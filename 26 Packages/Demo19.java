// import com.google.calculation; // common naming

// import java.util.ArrayList;

// import tools.AdvCalc2;
// import tools.Calc2;
// import other.tools.*;
import other.*;

// import java.lang.*; // by default

class C extends A
{
    public void abc()
    {
        System.out.println(marks);
    }
}

public class Demo19 
{
    public static void main(String a[]) 
    {
        // ArrayList list = new ArrayList();
        
        // Calc2 obj = new Calc2();
        // AdvCalc2 obj1 = new AdvCalc2();

        A obj = new A();
        System.out.println(obj.marks);
        obj.show();

        B obj1 = new B();
        System.out.println(obj1.marks);   
    }
}
