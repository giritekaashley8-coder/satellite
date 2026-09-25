public class Satellite {
    public static int[][] readImage(java.util.Scanner s, int n, int m) {
        int[][] img = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                img[i][j] = s.nextInt();
        return img;
    }

    public static int[] check(int i, int j, int[] r) {
        int x1 = Math.min(r[0], i + 1);
        int y1 = Math.min(r[1], j + 1);
        int x2 = Math.max(r[2], i + 1);
        int y2 = Math.max(r[3], j + 1);
        return new int[]{x1, y1, x2, y2};
    }

    public static int[] findRect(int[][] a, int[][] b, int n, int m) {
        int[] r = {n + 1, m + 1, 0, 0};
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (a[i][j] != b[i][j]) r = check(i, j, r);
        return r;
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int[][] a = readImage(s, n, m), b = readImage(s, n, m);
        int[] r = findRect(a, b, n, m);
        System.out.println(r[0] + " " + r[1] + " " + r[2] + " " + r[3]);
    }
}
