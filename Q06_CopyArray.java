import java.util.Arrays;import java.util.Scanner;
public class Q06_CopyArray {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Array size: ");int n=sc.nextInt();
  if(n<=0)System.out.println("Size must be positive.");else{int[] a=new int[n],b=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();for(int i=0;i<n;i++)b[i]=a[i];System.out.println("Original: "+Arrays.toString(a));System.out.println("Copy: "+Arrays.toString(b));}sc.close();
 }
}
