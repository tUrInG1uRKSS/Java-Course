class Computer // Idea of something
{
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost)
    {
        if (cost >= 10)
            return "Pen"; // stop the method
       
        return "Nothing";
    }
}

public class Demo6 
{
    public static void main(String a[])
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(12);
        System.out.println(str);
    }    
}
