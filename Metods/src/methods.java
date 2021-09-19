public class methods {

    public static void main(String[] args) {
        max(1, 2, 4, 5);
        //max(1, 2, 4, 4);
        findQuarter(2,-1);
        printeight(2, 4);
        printNtimes("a", 2);
    }

    public static void max(int a, int b, int c, int d) {
        if (a >= b && a >= c && a >= d) {
            System.out.println(a);
            return;
        }
        if (b >= a && b >= c && b >= d) {
            System.out.println(b);
            return;
        }
        if (c < b || c < a || c < d) {
        } else {
            System.out.println(c);
            return;
        }
        if (d >= b && d >= c && d >= a) {
            System.out.println(d);
            return;
        }
    }

    public static void findQuarter(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println(1);
            return;
        } else if (x < 0 && y > 0) {
            System.out.println(2);
            return;
        } else if (x > 0 && y < 0) {
            System.out.println(3);
            return;
        } else if (x < 0 && y < 0) {
            System.out.println(4);
            return;
        }
    }
    public static void printNtimes(String string, int n) {
        for (int i = 0; i < n; i++){
            System.out.println(string);
        }
    }
    public static void printeight(int m, int n) {
        for (int i = 0; i < m; i++){
            for (int a = 0; a < n; a++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}

