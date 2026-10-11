import java.util.Scanner;
public class Q10_ColumnSums {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Rows columns: ");int r=sc.nextInt(),c=sc.nextInt();
  if(r<=0||c<=0)System.out.println("Invalid dimensions.");else{int[][] a=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=sc.nextInt();for(int j=0;j<c;j++){long s=0;for(int i=0;i<r;i++)s+=a[i][j];System.out.println("Column "+(j+1)+" sum = "+s);}}sc.close();
 }
}
