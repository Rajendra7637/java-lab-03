import java.util.Scanner;
public class Q15_Sum3DArray {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Layers rows columns: ");int l=sc.nextInt(),r=sc.nextInt(),c=sc.nextInt();long sum=0;
  if(l<=0||r<=0||c<=0)System.out.println("Invalid dimensions.");else{for(int i=0;i<l;i++)for(int j=0;j<r;j++)for(int k=0;k<c;k++)sum+=sc.nextInt();System.out.println("Sum = "+sum);}sc.close();
 }
}
