public class Rotation
{
    public static boolean isRotation(String one, String two)
    {
        if(one.length() != two.length())
            return false;
        String full = one + one;
        return full.contains(two);
    }
    
    
    public static void main(String [] args)
    {
        System.out.println(isRotation("abcde","deabc"));
    }
}