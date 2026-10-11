import java.util.Scanner;
public class Q01_InputDisplayFive {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); int[] a=new int[5];
  for(int i=0;i<a.length;i++){System.out.print("Enter integer "+(i+1)+": ");a[i]=sc.nextInt();}
  System.out.print("Elements: "); for(int x:a)System.out.print(x+" "); System.out.println(); sc.close();
 }
}
