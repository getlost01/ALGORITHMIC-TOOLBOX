//collecting signature
import java.util.*;

public class CoveringSegments {

        private static int[] optimalPoints(Segment[] segments) {
            int[] points = new int[2 * segments.length];
            Arrays.sort(segments, (s1, s2) -> Integer.compare(s1.end, s2.end));
          

            int numPoints = 0;
            int point = segments[0].end;
           
            points[numPoints++] = point;

            for (int i = 1; i<segments.length; i++) {
                
                if (! inSegment(segments[i], point)) {

                   
                    point = segments[i].end;
                    
                    points[numPoints++] = point;
                }
            }

            int [] solution = new int[numPoints];
            for (int i = 0; i< numPoints; i++) {
                solution[i] = points[i];
            }

            return solution;

        }

        public static class Segment {
            int start, end;

            Segment(int start, int end) {
                this.start = start;
                this.end = end;
            }
        }

        public static boolean inSegment(Segment s, int point) {
            return point >= s.start && point <= s.end;
        }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }

    }
}