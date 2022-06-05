//Fifth
import java.util.*;
import java.io.*;

public class fibonaccihuge{
public static long fibonacci(long m)
{
	long a = 0;
	long b = 1;
	long c = 0;
	for(int i = 0; i < m * m; i++)
	{
		long temp = 0;
		temp = b;
		b = (a + b) % m;
		a = temp;
		if (a == 0 && b == 1)
			c= i + 1;
	}
	return c;
}


public static long fibonacciModulo(long n,long m)
{
	long fibonacciPeriod = fibonacci(m);
	n = n % fibonacciPeriod;
	long a = 0;
	long b = 1;
	
	if (n == 0)
		return 0;
	else if (n == 1)
		return 1;
	for(int i = 0; i < n - 1; i++)
	{
		long temp = 0;
		temp = b;
		b = (a + b) % m;
		a = temp;
	}
	return b % m;
}


public static void main(String[] args)
{
    Scanner sc=new  Scanner(System.in);
	long n = sc.nextLong();
	long m = sc.nextLong();
	System.out.println(fibonacciModulo(n, m));
}
}

