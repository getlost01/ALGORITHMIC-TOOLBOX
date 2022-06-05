//7
import java.util.*;

public class FibonacciPartialSumagain {
    public static long getFibonacciPartialSumFast(long from, long to) {

    long sum = 0;

    int m = (int) (from % 60); 
    int n = (int) (to % 60);

   
    if (n < m)
        n += 60;

    long current = 0;
    long next  = 1;

    for (int i = 0; i <= n; ++i) {
        if (i >= m) {
            sum += current;
        }

        long newCurrent = next;
        next = next + current;
        current = newCurrent;
    }

    return (int) (sum % 10);
}
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumFast(from, to));
    }
}