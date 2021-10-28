import java.util.*;

class ChefAndPairingSlippers {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int l=sc.nextInt();
            int x=sc.nextInt();
            int r=n-l;
            if(l<r){
                System.out.println(l*x);
            }
            else{
                System.out.println(r*x);
            }
        }
    }
}