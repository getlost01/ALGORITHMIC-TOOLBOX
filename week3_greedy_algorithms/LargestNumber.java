import java.util.*;

 class LargestNumber {
    private static String normalize(String a, int diff) {
        String result = a;
        for (int i = 0; i < diff; ++i) {
            result += a;
        }
        return result.substring(0, a.length() + diff);
    }

    private static String[] sortedArray(String[] a) {
        String[] b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            String max = "0000";
            int maxloc = -1;
            for (int j = 0; j < a.length; j++) {
                if (a[j] != "a") {
                    String aj, maxeq;
                    if (a[j].length() > max.length()) {
                        maxeq = normalize(max, a[j].length() - max.length());
                        aj = a[j];
                    } else if (a[j].length() < max.length()) {
                        aj = normalize(a[j], max.length() - a[j].length());
                        maxeq = max;
                    } else {
                        maxeq = max;
                        aj = a[j];
                    }

                  
                    int k = 0, scorem = 0, scorea = 0;
                    while (k < aj.length()) {
                        if (aj.charAt(k) > maxeq.charAt(k)) {
                            scorea++;
                            break;
                        } else if (aj.charAt(k) == maxeq.charAt(k)) {
                            scorem++;
                            scorea++;
                        } else {
                            scorem++;
                            break;
                        }
                        k++;
                    }
                    if (scorea > scorem) {
                        max = a[j];
                        maxloc = j;
                    } else if (scorea == scorem) {
                        if (a[j].length() < max.length()) {
                            if (max.charAt(max.length() / 2) > max.charAt(0)) {
                                max = a[j];
                                maxloc = j;
                            }
                        } else {
                            if (a[j].charAt(a[j].length() / 2) < a[j].charAt(0)) {
                                max = a[j];
                                maxloc = j;
                            }
                        }

                    }
                }
            }
            b[i] = max;
            a[maxloc] = "a";
        }
        return b;
    }

    private static String largestNumber(String[] a) {
     
        a = sortedArray(a);
        String result = "";
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}

