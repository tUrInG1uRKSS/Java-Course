public class Demo17 
{
    public static void main(String a[])
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        int r3 = obj.sub(5, 3);
        int r4 = obj.sub(15, 3);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
    
}
