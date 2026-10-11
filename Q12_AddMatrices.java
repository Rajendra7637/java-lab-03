import java.util.Scanner;
public class Q12_AddMatrices {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Rows columns: ");int r=sc.nextInt(),c=sc.nextInt();
  if(r<=0||c<=0)System.out.println("Invalid dimensions.");else{int[][] a=new int[r][c],b=new int[r][c];System.out.println("Enter matrix A:");for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=sc.nextInt();System.out.println("Enter matrix B:");for(int i=0;i<r;i++)for(int j=0;j<c;j++)b[i][j]=sc.nextInt();for(int i=0;i<r;i++){for(int j=0;j<c;j++)System.out.print((a[i][j]+b[i][j])+"\t");System.out.println();}}sc.close();
 }
}
