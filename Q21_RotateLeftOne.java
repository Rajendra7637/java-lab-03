import java.util.Arrays;import java.util.Scanner;
public class Q21_RotateLeftOne {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Array size: ");int n=sc.nextInt();if(n<=0){System.out.println("Invalid size.");sc.close();return;}int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int first=a[0];for(int i=0;i<n-1;i++)a[i]=a[i+1];a[n-1]=first;System.out.println(Arrays.toString(a));sc.close();
 }
}
