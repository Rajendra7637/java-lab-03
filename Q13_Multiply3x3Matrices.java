import java.util.Scanner;
public class Q13_Multiply3x3Matrices {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);int[][] a=new int[3][3],b=new int[3][3],p=new int[3][3];System.out.println("Enter matrix A:");for(int i=0;i<3;i++)for(int j=0;j<3;j++)a[i][j]=sc.nextInt();System.out.println("Enter matrix B:");for(int i=0;i<3;i++)for(int j=0;j<3;j++)b[i][j]=sc.nextInt();
  for(int i=0;i<3;i++)for(int j=0;j<3;j++)for(int k=0;k<3;k++)p[i][j]+=a[i][k]*b[k][j];for(int[] row:p){for(int x:row)System.out.print(x+"\t");System.out.println();}sc.close();
 }
}
