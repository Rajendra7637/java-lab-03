import java.util.Scanner;
public class Q20_StudentSubjectMarks {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.print("Number of students: ");int n=sc.nextInt();if(n<=0){System.out.println("Invalid count.");sc.close();return;}int[][] marks=new int[n][];
  for(int i=0;i<n;i++){System.out.print("Subjects for student "+(i+1)+": ");int m=sc.nextInt();if(m<0){System.out.println("Invalid subject count.");sc.close();return;}marks[i]=new int[m];for(int j=0;j<m;j++)marks[i][j]=sc.nextInt();}
  for(int i=0;i<n;i++){System.out.print("Student "+(i+1)+": ");for(int x:marks[i])System.out.print(x+" ");System.out.println();}sc.close();
 }
}
