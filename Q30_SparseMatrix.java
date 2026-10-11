import java.util.Scanner;
public class Q30_SparseMatrix {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Rows columns: ");int r=sc.nextInt(),c=sc.nextInt();if(r<=0||c<=0){System.out.println("Invalid dimensions.");sc.close();return;}int zero=0,nonzero=0;
  for(int i=0;i<r;i++)for(int j=0;j<c;j++){int x=sc.nextInt();if(x==0)zero++;else nonzero++;}System.out.println("Zero elements = "+zero);System.out.println("Non-zero elements = "+nonzero);System.out.println(zero>nonzero?"Sparse matrix":"Not a sparse matrix");sc.close();
 }
}
