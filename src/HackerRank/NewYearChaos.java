package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NewYearChaos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++)
        {
            int n = in.nextInt();
            int q[] = new int[n];
            for(int q_i=0; q_i < n; q_i++)
                q[q_i] = in.nextInt();

            int bribe = 0;
            boolean chaotic = false;
            for(int i = 0; i < n; i++)
            {
                if(q[i]-(i+1) > 2)
                {
                    chaotic = true;
                    break;
                }
                for (int j = Math.max(0, q[i]-1-1); j < i; j++)
                    if (q[j] > q[i])
                        bribe++;
            }
            if(chaotic)
                System.out.println("Too chaotic");
            else
                System.out.println(bribe);
        }
    }

}
