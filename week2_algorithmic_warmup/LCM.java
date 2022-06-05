//Fourth
import java.util.Scanner;
public class LCM {
  public static long findGCD(long a, long b)  
  {  
        while(b != 0)  
        {  
          if(a > b)  
          a -= b;
          else  
          b -= a;  
        }  
       return a;  
  } 

  public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long gcd = findGCD(a,b);
        
        long lcm = (a * b) / gcd;
        System.out.print(lcm);
  }
}
