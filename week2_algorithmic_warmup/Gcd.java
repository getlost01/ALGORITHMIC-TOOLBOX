//Third
//Here we are using loop method, to avoid backtracking(on the usage of reccursion method).
import java.util.Scanner;  
public class Gcd  
{  
   public static int findGCD(int a, int b)  
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
        Scanner sc = new Scanner(System.in);  
        int a = sc.nextInt();     
        int b = sc.nextInt();  
        int gcd = findGCD(a, b);  
        System.out.println(gcd);  
    }  

}