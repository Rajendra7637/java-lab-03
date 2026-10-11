import java.util.Scanner;
public class Q26_TriangularMatrixParts {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Square matrix size: ");int n=sc.nextInt();if(n<=0){System.out.println("Invalid size.");sc.close();return;}int[][] a=new int[n][n];for(int i=0;i<n;i++)for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
  System.out.println("Upper triangular:");for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print((i<=j?a[i][j]:0)+"\t");System.out.println();}System.out.println("Lower triangular:");for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print((i>=j?a[i][j]:0)+"\t");System.out.println();}sc.close();
 }
}
