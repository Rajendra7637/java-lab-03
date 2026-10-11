import java.util.Scanner;
public class Q28_Search2DArray {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Rows columns: ");int r=sc.nextInt(),c=sc.nextInt();if(r<=0||c<=0){System.out.println("Invalid dimensions.");sc.close();return;}int[][] a=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=sc.nextInt();System.out.print("Search value: ");int target=sc.nextInt();boolean found=false;
  for(int i=0;i<r;i++)for(int j=0;j<c;j++)if(a[i][j]==target){System.out.println("Found at row "+i+", column "+j+" (zero-based).");found=true;}if(!found)System.out.println("Not found.");sc.close();
 }
}
