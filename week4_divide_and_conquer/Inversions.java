import java.util.*;

public class Inversions {

    private static int mergeAndCount(int[] A, int[] b, int left, int mid, int right) {
      
        int i = left;
        int j = mid;
        int k = left;
        int inversionCount = 0;

         while (i <= mid - 1 && j <= right) {
            if (A[i] <= A[j]) {
                b[k++] = A[i++];
            } else {
                  inversionCount += mid - i;  
                b[k++] = A[j++]; 
            }

        } 

           while (i <= mid - 1) {
            b[k++] = A[i++];
        }

        while (j <= right) {
            b[k++] = A[j++];
        }

        for (i=left; i <= right; i++) {

            A[i] = b[i];
        }

        return inversionCount;

    }

    private static long getNumberOfInversions(int[] a, int[] b, int left, int right) {
        long numberOfInversions = 0;

    
        if (right <= left) {
            return numberOfInversions;
        }
      int mid = left + (right - left) / 2;

        numberOfInversions += getNumberOfInversions(a, b, left, mid);
        numberOfInversions += getNumberOfInversions(a, b, mid + 1, right);
        numberOfInversions += mergeAndCount(a,b, left, mid+1, right);

        return numberOfInversions;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        System.out.println(getNumberOfInversions(a, b, 0, a.length - 1));
    }
}