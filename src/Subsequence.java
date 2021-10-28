//01Subsequence

import java.util.*;

class Subsequence {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] c=new int[n];
            for(int i=0;i<n;i++){
                c[i]=sc.nextInt();
            }
            int s0=0;
            int s1=0;
            int s=0;
            ArrayList<Integer> a=new ArrayList<Integer>();
            ArrayList<Integer> b=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                if(i%2==0){
                    a.add(c[i]);
                    s0+=c[i];
                }
                else{
                    b.add(c[i]);
                    s1+=c[i];
                }
            }
            Collections.sort(a, Collections.reverseOrder());
            Collections.sort(b);
            for(int i=0;i<n;i++){
                if(i%2==0){
                    c[i]=a.get(0);
                    s+=(a.get(0)*s1);
                    s0-=a.get(0);
                    a.remove(0);
                }
                else{
                    c[i]=b.get(0);
                    s1-=b.get(0);
                    b.remove(0);
                }
            }

            for(int i=0;i<n;i++){
                System.out.print(c[i]+" ");
            }
            System.out.println();
            System.out.println(s);
        }
    }
}