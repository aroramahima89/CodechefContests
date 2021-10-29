

import java.util.*;

class QueensPlacement {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int i=0;
            for(i=0;i<n-3;i++){
                String s="";
                int x=0;
                while(s.length()!=n){
                    if(x==n-i-1){
                        s+="Q";
                    }
                    else{
                        s+=".";
                    }
                    x++;
                }
                System.out.println(s);
            }
            for(int x=i;x<n;x++){
                String st="";
                if(x==n-2){
                    //     System.out.println("bdfb");
                    while(st.length()!=n){
                        if(st.length()==1){
                            st+="Q";
                        }
                        else{
                            st+=".";
                        }
                    }
                }
                else{
                    //    System.out.println(x);
                    while(st.length()<n){
                        st+=".";
                    }
                }
                System.out.println(st);
            }
        }
    }
}