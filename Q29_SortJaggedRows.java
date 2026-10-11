import java.util.Arrays;import java.util.Scanner;
public class Q29_SortJaggedRows {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Number of rows: ");int r=sc.nextInt();if(r<=0){System.out.println("Invalid rows.");sc.close();return;}int[][] a=new int[r][];for(int i=0;i<r;i++){System.out.print("Length of row "+(i+1)+": ");int n=sc.nextInt();if(n<0){System.out.println("Invalid length.");sc.close();return;}a[i]=new int[n];for(int j=0;j<n;j++)a[i][j]=sc.nextInt();Arrays.sort(a[i]);}for(int[] row:a)System.out.println(Arrays.toString(row));sc.close();
 }
}
