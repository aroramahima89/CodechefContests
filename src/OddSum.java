import java.util.*;
import java.lang.*;

class OddSum {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==1 || n==2){
                System.out.println(1);
            }
            else{
                long b=1;
                b+=(2*(Math.pow(2,n-2)-1));
                System.out.println(b);
            }
        }
    }
}