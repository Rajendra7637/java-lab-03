import java.util.Arrays;import java.util.Scanner;
public class Q24_RemoveDuplicates {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Array size: ");int n=sc.nextInt();if(n<=0){System.out.println("Invalid size.");sc.close();return;}int[] a=new int[n],u=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int count=0;
  for(int x:a){boolean exists=false;for(int j=0;j<count;j++)if(u[j]==x){exists=true;break;}if(!exists)u[count++]=x;}System.out.println("Unique elements: "+Arrays.toString(Arrays.copyOf(u,count)));sc.close();
 }
}
