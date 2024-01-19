class Human
{
    // Source Action
    private int age; // accesible only in the same class
    private String name;
    // default int = 0
    // default Strin String = null

    public Human() // default constructor : special method
    {
        // same name of class
        // no return
        // called when creating object
        age = 12;
        name = "Jhon";
        // here connection with database
    }

    public Human(String name) {
        this.age = 12;
        this.name = name;
    }

    public Human(int a, String n) // Parameterized Constructor 
    {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; // this = current object
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // By ME
    // public int getAge()
    // {   
    //     return age; // indirect access via methods
    // }

    // public void setAge(int a)
    // {
    //     age = a;
    // }

    // public String getName()
    // {
    //     return name;
    // }

    // public void setName(String n)
    // {
    //     name = n;
    // }

    
}

public class Demo13
{
    public static void main(String[] args) 
    {
        Human obj = new Human(); // called constructor
        Human obj1 = new Human(18, "Jose");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        // obj.age = 11;
        obj.setAge(30); // assign
        // obj.name = "Leandro";
        // obj.setName("Marco");

        // System.out.println(obj.getName() + " : " + obj.getAge()); // getting      
    }
}