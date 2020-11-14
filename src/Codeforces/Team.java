package Codeforces;
import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); int k = in.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[j] = in.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > k) ++count;
        }
        System.out.println(count);
    }
}