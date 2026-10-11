import java.util.Scanner;
public class Q16_CountPositiveNegative3D {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Layers rows columns: ");int l=sc.nextInt(),r=sc.nextInt(),c=sc.nextInt(),pos=0,neg=0,zero=0;
  if(l<=0||r<=0||c<=0)System.out.println("Invalid dimensions.");else{for(int i=0;i<l;i++)for(int j=0;j<r;j++)for(int k=0;k<c;k++){int x=sc.nextInt();if(x>0)pos++;else if(x<0)neg++;else zero++;}System.out.println("Positive = "+pos+"\nNegative = "+neg+"\nZero = "+zero);}sc.close();
 }
}
