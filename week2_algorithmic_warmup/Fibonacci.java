// First one
import java.util.Scanner;

 public class Fibonacci {
    static int FiboNumberAt(int n)
    {
        int a = 0, b = 1, c = 0;
        for(int i=0;i<n;++i)
        {
            int temp = b + a;
            a = b;
            b = temp;
        } 
        return a;
    }


    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(FiboNumberAt(n)); 
    }
}
