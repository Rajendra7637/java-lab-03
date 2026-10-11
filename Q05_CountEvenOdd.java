import java.util.Scanner;
public class Q05_CountEvenOdd {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Array size: ");int n=sc.nextInt();int even=0,odd=0;
  if(n<=0)System.out.println("Size must be positive.");else{for(int i=0;i<n;i++){int x=sc.nextInt();if(x%2==0)even++;else odd++;}System.out.println("Even = "+even+"\nOdd = "+odd);}sc.close();
 }
}
