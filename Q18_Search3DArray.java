import java.util.Scanner;
public class Q18_Search3DArray {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);int[][][] a=new int[2][2][2];for(int i=0;i<2;i++)for(int j=0;j<2;j++)for(int k=0;k<2;k++)a[i][j][k]=sc.nextInt();System.out.print("Search value: ");int target=sc.nextInt();boolean found=false;
  for(int i=0;i<2;i++)for(int j=0;j<2;j++)for(int k=0;k<2;k++)if(a[i][j][k]==target){System.out.println("Found at layer "+i+", row "+j+", column "+k+" (zero-based).");found=true;}if(!found)System.out.println("Not found.");sc.close();
 }
}
