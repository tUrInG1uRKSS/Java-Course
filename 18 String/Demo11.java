public class Demo11
{
    public static void main(String a[]) 
    {
        // String name = "navin"; 
        // String is a class
        // String name = new String("navin");
        // String name = "navin"; // no need of new
        // name = name + " reddy"; // eligible for garbage collection

        // System.out.println("hello " + name);
        // System.out.println(name.hashCode());
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat(" reddy"));

        // String s1 = "Navin";
        // String s2 = "Navin";
        
        // System.out.println(s1 == s2); // string constant pool

        // Inmutable string -> unchange (by default)
        // Mutable string  -> change:
        // String Buffer and String Builder
        StringBuffer sb = new StringBuffer("Navin"); 
        System.out.println(sb.capacity()); // buffer size = 16B
        // store name and 16 space extra to avoid relocation
        System.out.println(sb.length());

        sb.append(" Reddy");

        sb.deleteCharAt(2);
        sb.insert(0, "Java ");
        sb.setLength(30);
        sb.ensureCapacity(100);

        // String str = sb.toString(); // conversion

        System.out.println(sb);

        // StringBuffer is thread safe anf StringBuilder is not        
    }
}