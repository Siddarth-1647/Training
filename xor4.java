import java.util.Scanner;

public class xor4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int a=0;
        int b=0;
        if(r%4==1){
            a=1;
        }
        if(r%4==2){
            a=r+1;
        }
        if(r%4==3) a=0;
        if(r%4==0) a=r;
        if((l-1)%4==1) b=1;
        if((l-1)%4==2) b=(l-1)+1;
        if((l-1)%4==3) b=0;
        if((l-1)%4==0) b=(l-1);
        System.out.println(a^b);
    }
}