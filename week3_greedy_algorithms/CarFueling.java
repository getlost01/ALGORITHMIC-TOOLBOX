import java.util.*;
import java.io.*;

 public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int currentRefill = 0, numRefill = 0;
        int[] allstop = new int[stops.length + 2];
        for (int i = 0; i < stops.length; i++) {
            allstop[i + 1] = stops[i];
        }
        allstop[stops.length + 1] = dist;
        
        if (tank > dist)
            return 0;
        while (currentRefill < allstop.length) {
            int lastRefill = currentRefill;
    
            while (currentRefill < allstop.length - 1 && allstop[currentRefill + 1] - allstop[lastRefill] <= tank) {
                currentRefill += 1;
            }
            if (currentRefill == lastRefill) {
                return -1;
            }
        
            if (currentRefill == allstop.length - 1)
                break;
      
            if (currentRefill < allstop.length)
                numRefill++;
        }
        return numRefill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    
    }
}