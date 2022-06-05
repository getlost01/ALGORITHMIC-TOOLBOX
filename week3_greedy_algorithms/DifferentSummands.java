//maximum_number_of_prizes
import java.util.*;

public class DifferentSummands {
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        int currentNum = 1;
        int sum = 0;

        while (true) {
            int spaceLeft = n - sum;
            int spaceLeftAfterCurrentAppend = spaceLeft - currentNum;

            if (spaceLeftAfterCurrentAppend > currentNum) {
               
                sum += currentNum;
                summands.add(currentNum);   
                currentNum++; 
                continue;
            } else {

               
                summands.add(spaceLeft);
                break;
            }
        }
        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}