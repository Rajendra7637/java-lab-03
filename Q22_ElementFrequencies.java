import java.util.Scanner;
public class Q22_ElementFrequencies {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Array size: ");int n=sc.nextInt();if(n<=0){System.out.println("Invalid size.");sc.close();return;}int[] a=new int[n];boolean[] seen=new boolean[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();
  for(int i=0;i<n;i++){if(seen[i])continue;int count=1;for(int j=i+1;j<n;j++)if(a[i]==a[j]){count++;seen[j]=true;}System.out.println(a[i]+" appears "+count+" time(s).");}sc.close();
 }
}
