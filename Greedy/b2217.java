package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] maxkg = new int[N];
        for(int i = 0;i<N;i++){
            maxkg[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(maxkg);

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<maxkg.length;i++){
            max = Math.max(max,maxkg[i]*(N - i));
        }
        System.out.println(max);
    }
}
