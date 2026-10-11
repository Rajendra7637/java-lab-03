public class Q19_JaggedArrayDisplay {
 public static void main(String[] args) {
  int[][] a={{1,2},{3,4,5},{6,7,8,9}};for(int i=0;i<a.length;i++){System.out.print("Row "+(i+1)+": ");for(int x:a[i])System.out.print(x+" ");System.out.println();}
 }
}
