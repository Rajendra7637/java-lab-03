import java.util.Scanner;
public class Q04_MaximumArray {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Array size: ");int n=sc.nextInt();
  if(n<=0)System.out.println("Size must be positive.");else{int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int max=a[0];for(int x:a)if(x>max)max=x;System.out.println("Maximum = "+max);}sc.close();
 }
}
