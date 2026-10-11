import java.util.Scanner;
public class Q07_Display3x3Matrix {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);int[][] a=new int[3][3];for(int i=0;i<3;i++)for(int j=0;j<3;j++)a[i][j]=sc.nextInt();
  for(int[] row:a){for(int x:row)System.out.print(x+"\t");System.out.println();}sc.close();
 }
}
