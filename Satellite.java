public class Satellite {
    public static int[][] read(java.util.Scanner s, int n, int m) {
        int[][] img = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                img[i][j] = s.nextInt();
        return img;
    }

    public static int[] find(int[][] a, int[][] b, int n, int m) {
        int x1 = n, y1 = m, x2 = 0, y2 = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (a[i][j] != b[i][j]) {
                    if (i < x1) x1 = i; if (j < y1) y1 = j;
                    if (i > x2) x2 = i; if (j > y2) y2 = j;
                }
        return new int[]{x1 + 1, y1 + 1, x2 + 1, y2 + 1};
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int[][] a = read(s, n, m), b = read(s, n, m);
        int[] r = find(a, b, n, m);
        System.out.println(r[0] + " " + r[1] + " " + r[2] + " " + r[3]);
    }
}
