import java.util.Scanner;
public class Q03_SumArray {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Array size: ");int n=sc.nextInt();long sum=0;
  if(n<=0)System.out.println("Size must be positive.");else{int[] a=new int[n];for(int i=0;i<n;i++){a[i]=sc.nextInt();sum+=a[i];}System.out.println("Sum = "+sum);}sc.close();
 }
}
