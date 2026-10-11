import java.util.Scanner;
public class Q27_BoundaryMatrix {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Rows columns: ");int r=sc.nextInt(),c=sc.nextInt();if(r<=0||c<=0){System.out.println("Invalid dimensions.");sc.close();return;}int[][] a=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=sc.nextInt();
  System.out.println("Boundary elements:");for(int i=0;i<r;i++){for(int j=0;j<c;j++)if(i==0||i==r-1||j==0||j==c-1)System.out.print(a[i][j]+"\t");else System.out.print("\t");System.out.println();}sc.close();
 }
}
