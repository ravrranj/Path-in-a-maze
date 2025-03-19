

public class countPath{
  
    public static int MazePath(int i, int j, int m, int n) {
    // Base case : Reached bottom-right corner

    if( i==n && j==m) return 1;

    // out of bounds check
    if (i > n || j > m) return 0;

    //Move right and down 
    return MazePath(i+1, j, n, m) + MazePath(i, j+1, n, m);

    }

    public static void  main(String args[]){
        int n = 3, m = 3; //Maze size 
        System.out.println("Total paths: " + MazePath(0, 0, n-1, m-1));
    }
}