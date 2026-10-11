import java.util.Scanner;
public class Q02_ReverseTenIntegers {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); int[] a=new int[10];
  for(int i=0;i<10;i++){System.out.print("Enter integer "+(i+1)+": ");a[i]=sc.nextInt();}
  System.out.print("Reverse: ");for(int i=9;i>=0;i--)System.out.print(a[i]+" ");System.out.println();sc.close();
 }
}
