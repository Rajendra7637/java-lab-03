import java.util.Scanner;
public class Q25_DiagonalSums {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Square matrix size: ");int n=sc.nextInt();if(n<=0){System.out.println("Invalid size.");sc.close();return;}int[][] a=new int[n][n];for(int i=0;i<n;i++)for(int j=0;j<n;j++)a[i][j]=sc.nextInt();long main=0,secondary=0;for(int i=0;i<n;i++){main+=a[i][i];secondary+=a[i][n-1-i];}System.out.println("Main diagonal sum = "+main);System.out.println("Secondary diagonal sum = "+secondary);sc.close();
 }
}
