import java.util.Scanner;

public class array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int size=sc.nextInt();
        int[] num=new int[size];
        int[] hash=new int[size];
        System.out.println("enter array elements: ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) hash[num[i]]++;
        for(int i=0;i<size;i++){
            if(hash[i]>0) System.out.println(i+"'s "+hash[i]);
        }
        
    }
        
}