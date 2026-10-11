import java.util.Scanner;
public class Q08_SumMatrix {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Rows columns: ");int r=sc.nextInt(),c=sc.nextInt();long sum=0;
  if(r<=0||c<=0)System.out.println("Invalid dimensions.");else{for(int i=0;i<r;i++)for(int j=0;j<c;j++)sum+=sc.nextInt();System.out.println("Sum = "+sum);}sc.close();
 }
}
