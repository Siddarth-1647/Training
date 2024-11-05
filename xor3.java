import java.util.Scanner;
public class xor3 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a=0;
        for(int i=m;i<=n;i++){
            a=a^i;
        }
        System.out.println(a);
    }
}
}
