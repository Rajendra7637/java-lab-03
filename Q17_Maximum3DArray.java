import java.util.Scanner;
public class Q17_Maximum3DArray {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Layers rows columns: ");int l=sc.nextInt(),r=sc.nextInt(),c=sc.nextInt();
  if(l<=0||r<=0||c<=0)System.out.println("Invalid dimensions.");else{int max=Integer.MIN_VALUE;for(int i=0;i<l;i++)for(int j=0;j<r;j++)for(int k=0;k<c;k++){int x=sc.nextInt();if(x>max)max=x;}System.out.println("Maximum = "+max);}sc.close();
 }
}
