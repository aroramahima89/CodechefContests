import java.util.*;
public class Ramdev {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long b=sc.nextLong();
        int n=sc.nextInt();
        int[] L=new int[n];
        int[] B=new int[n];
        for(int i=0;i<n;i++){
            L[i]=sc.nextInt();
            B[i]=sc.nextInt();
        }
        long s=0;
        for(int i=0;i<n;i++){
            s+=Math.max((L[i]/l)*(B[i]/b),(L[i]/b)*(B[i]/l));
        }
        System.out.println(s);
    }
}