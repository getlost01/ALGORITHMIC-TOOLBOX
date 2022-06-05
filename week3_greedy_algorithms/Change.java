
// Money Change
import java.util.Scanner;
public class Change
{
    	public static int  get_change(int m) {
	int n = m / 10;
	m %= 10;
	n += m / 5;
	m %= 5;
	n += m;
	return n;
}

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			
	
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		
		System.out.println(get_change(m));
	

		
	}
}
