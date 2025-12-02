import java.util.Scanner;

/**
 * Write a description of class W1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W1
{
    public static void main(String[] args)
    {
        /*
        System.out.println("It is our first week of programming.");
        System.out.println("It is easier to learn");
        System.out.println("Krish");
        
        // int, float, double, string, boolean
        
        int age = 18;
        System.out.println(age);
        
        double weight = 75.06;
        System.out.println(weight);
        
        String name = "Krish";
        System.out.println(name);
        
        boolean isPassed= true;
        System.out.println(isPassed);
        
        // Arithematic Operator
        
        int num1=10;
        int num2=11;
        
        int sum = num1 + num2;
        int diff = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int remain = num1 % num2;
        
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(remain);
        
        // Relational Operator 
        
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        
        // Pre-increment and Post-increment, Decrement
        
        int h=1;
        System.out.println(h); // h=1
        System.out.println(++h); // ++h=2 h=2
        System.out.println(h); //h=2
        System.out.println(h++); //h++ =2 h=3
        System.out.println(h); // h=3
        
        
        int m=10;
        int k= m++; // m++ = 10, m=11, k=10
        int n= ++m; // ++m = 12, m=12, n= 12
        
        System.out.println(m+k+n);
        
        
        int s= 10;
        int t= --s; // --s = 9, s =9
        int r = s--; // s-- = 9, s= 8
        
        System.out.println(s+t+r);
        
        // Scanner class 
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter your First Number");
        
        int num4 = scan.nextInt();
        
        System.out.println("My First Number is: " + num4);
        
        System.out.println("Enter your Second Number");
        
        double num5 = scan.nextDouble();
         
        System.out.println("My Second NUmber is: " + num5);
        
        scan.nextLine();
        
        System.out.println("Enter your Name");
        
        String namee= scan.nextLine();
        System.out.println("My name is" + namee);
        
        */
    
   
        Scanner scan= new Scanner(System.in);
        System.out.println("What is your age");
        
        int agree= scan.nextInt();
        
        String isEligible= (agree >= 18)? "Driving is allowed" : "Driving is not allowed":
        System.out.println(isEligible);
        
        
        // byte, short, long 
        
        System.out.println(Byte,MAX_VALUE); // maximum value
        System.out.println(Byte,MIN_VALUE); // minimum value
        System.out.println(Byte,SIZE);   // bits
        System.out.println(Byte,BYTES); // bytes
    }


}