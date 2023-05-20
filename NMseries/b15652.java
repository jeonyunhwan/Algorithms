package Backtracking.NMseries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b15652 {
    static int n,m;
    static int[] arr;
    static boolean[] isUsed;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        solution(0);
        System.out.println(sb);
    }
    public static void solution(int depth){
        if(m == depth){
            for(int val : arr){
                sb.append(val).append(" ");
            }
            sb.append("\n"); return;
        }
        //비 내림차순
        int start = 1;

        if(depth != 0) start = arr[depth - 1];
        for(int i=start;i<=n; i++){
                arr[depth] = i;
                solution(depth+1);
        }
    }
}
