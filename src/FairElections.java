import java.util.*;

public class FairElections {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int s=0;
            int[] a=new int[n];
            int[] b=new int[m];
            int x=0;
            int y=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                x+=a[i];
            }
            for(int i=0;i<m;i++){
                b[i]=sc.nextInt();
                y+=b[i];
            }

            if(x<y){
                Arrays.sort(a);
                Arrays.sort(b);
                for(int i=0,j=m-1;i<n;i++,j--){
                    if(j==-1){
                        j=m-1;
                    }
                    x-=a[i];
                    x+=b[j];
                    y-=b[j];
                    y+=a[i];
                    s++;
                    if(x>y){
                        break;
                    }
                }
            }
            if(x>y){
                System.out.println(s);
            }
            else{
                System.out.println("-1");
            }
        }

    }
}