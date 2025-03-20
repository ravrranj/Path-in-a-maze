import java.util.Scanner;

public class countPathBacktracking {
 
    public static void findPaths( int i , int j, int n, int m, String path) {
    
        // Base case : Reached bottom-right corner
        if(i == n - 1 && j == m - 1) {
            System.out.println(path);
            return;
        }

        // Out of bounds check
        if ( i >= n || j >= m) return;

        //move right
        findPaths(i, j + 1, n, m, path + "R");

        //move down
        findPaths(i + 1, j, n, m, path + "D");

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Take user input fopr maze size
        System.out.print("Enter number of rows (n) : ");
        int n = sc.nextInt();

        System.out.print("Enter number of colums (m) : ");
        int m = sc.nextInt();
        sc.close();

        System.out.println("Possible paths: ");
        findPaths(0, 0, n, m, "");

    }
}