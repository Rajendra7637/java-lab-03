import java.util.Scanner;
public class Q23_SecondLargest {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Array size: ");int n=sc.nextInt();if(n<2){System.out.println("At least two elements required.");sc.close();return;}int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();Integer max=null,second=null;
  for(int x:a){if(max==null||x>max){if(max!=null)second=max;max=x;}else if(x<max&&(second==null||x>second))second=x;}if(second==null)System.out.println("No distinct second-largest element.");else System.out.println("Second largest = "+second);sc.close();
 }
}
