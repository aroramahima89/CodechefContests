import java.util.*;

class Average {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] A=new int[n];

            for(int i=0;i<n;i++){
                A[i]=sc.nextInt();
            }

            int b=0;
            for(int i=0;i<n;i++){
                int c=0;
                for(int j=0;j<n;j++){
                    if(A[i]>=A[j]){
                        c++;
                    }
                }
                if(c>(n-c)){
                    b++;
                }
            }
            System.out.println(b);
        }
    }
}