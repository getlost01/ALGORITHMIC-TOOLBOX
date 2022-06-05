

import java.util.*;
import java.lang.*;
import java.io.*;


class maximumpair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long [n];
		for(int i=0;i<n;i++)
		 arr[i]=sc.nextInt();

		Arrays.sort(arr);
		System.out.println(arr[n-1]*arr[n-2]);
	}
}
