package Modarray;
import java.util.Scanner;

public class Modarraypro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int ans=arr[0];
        for(int i=1;i<len;i++){
            ans=Integer.valueOf(String.valueOf(ans)+String.valueOf(arr[i]));
        }
        int b = sc.nextInt();
        System.out.println(ans%b);
    }
}