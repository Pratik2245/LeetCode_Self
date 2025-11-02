public class LC_2257CountTheUngardedCellsIntheGrid {
    public static void main(String[] args) {
        int m = 4;
        int n = 6;

        int[][] guards = {
                {0, 0},
                {1, 1},
                {2, 3}
        };

        int[][] walls = {
                {0, 1},
                {2, 2},
                {1, 4}
        };
        int ans = countUnguarded(m, n, guards, walls);
        System.out.println(ans);
    }

//    public static void addGaurd(int g1, int g2, int[][] b) {
//       int m=b.length;
//       int n=b[0].length;
//
//       b[g1][g2]=1;
//        for (int i = g1 - 1; i >= 0; i--) {
//            if (b[i][g2] == 2 || b[i][g2] == 1) break; // stop at wall or guard
//            b[i][g2] = 3;
//        }
//
//        // DOWN direction
//        for (int i = g1 + 1; i < m; i++) {
//            if (b[i][g2] == 2 || b[i][g2] == 1) break;
//            b[i][g2] = 3;
//        }
//
//        // LEFT direction
//        for (int j = g2 - 1; j >= 0; j--) {
//            if (b[g1][j] == 2 || b[g1][j] == 1) break;
//            b[g1][j] = 3;
//        }
//
//        // RIGHT direction
//        for (int j = g2 + 1; j < n; j++) {
//            if (b[g1][j] == 2 || b[g1][j] == 1) break;
//            b[g1][j] = 3;
//        }

//    }
     public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
            int[][] b = new int[m][n];
            // 0 = empty, 1 = guard, 2 = wall, 3 = guarded

            // mark walls and guards
            for (int[] w : walls) b[w[0]][w[1]] = 2;
            for (int[] g : guards) b[g[0]][g[1]] = 1;

            // sweep row-wise
            for (int i = 0; i < m; i++) {
                boolean seen = false;
                // left to right
                for (int j = 0; j < n; j++) {
                    if (b[i][j] == 2) seen = false; // wall breaks line of sight
                    else if (b[i][j] == 1) seen = true; // guard found
                    else if (seen) b[i][j] = 3; // mark as guarded
                }

                seen = false;
                // right to left
                for (int j = n - 1; j >= 0; j--) {
                    if (b[i][j] == 2) seen = false;
                    else if (b[i][j] == 1) seen = true;
                    else if (seen) b[i][j] = 3;
                }
            }

            // sweep column-wise
            for (int j = 0; j < n; j++) {
                boolean seen = false;
                // top to bottom
                for (int i = 0; i < m; i++) {
                    if (b[i][j] == 2) seen = false;
                    else if (b[i][j] == 1) seen = true;
                    else if (seen) b[i][j] = 3;
                }

                seen = false;
                // bottom to top
                for (int i = m - 1; i >= 0; i--) {
                    if (b[i][j] == 2) seen = false;
                    else if (b[i][j] == 1) seen = true;
                    else if (seen) b[i][j] = 3;
                }
            }

            // count unguarded cells
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (b[i][j] == 0) count++;
                }
            }

            return count;

    }
//    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
//        int b[][]=new int[m][n];
//     for(int i = 0; i< walls.length; i++){
//             int ind1=walls[i][0];
//             int ind2=walls[i][1];
//             b[ind1][ind2]=2;
//     }
//     for(int i=0;i<guards.length;i++){
//         int g1=guards[i][0];
//         int g2=guards[i][1];
//         addGaurd(g1,g2,b);
//     }
//     int count=0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(b[i][j]==0){
//                    count+=1;
//                }
//            }
//        }
//        return count;
//}
}
