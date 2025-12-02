
/**
 * Write a description of class W3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W3
{
    public static void main(String[ ] args)
    {
        // byte, short long
        System.out.println(Byte.MAX_VALUE); // maximum value
        System.out.println(Byte.MIN_VALUE); // minimum value
        System.out.println(Byte.SIZE); // size
        System.out.println(Byte.BYTES); // Bytes
        
        System.out.println(Short.MAX_VALUE); // maximum value
        System.out.println(Short.MIN_VALUE); // minimum value
        System.out.println(Short.SIZE); // size
        System.out.println(Short.BYTES); // Bytes
        
        System.out.println(Long.MAX_VALUE); // maximum value
        System.out.println(Long.MIN_VALUE); // Minimum value
        System.out.println(Long.SIZE); // size
        System.out.println(Long.BYTES); // Bytes
        
        // implicit typecasting --> widening casting
        
        byte bt = 127;
        short st = bt;
        
        System.out.println(st);
        
        // explicit typecasting --> narrowing casting
        
        double dr = 10.08d;
        int it= (int)dr;
        
        System.out.println(it);
        
        long lg= 9223372036854775807L;
        short str = (short) lg;
        
        System.out.println(str);
    
    }
    
}