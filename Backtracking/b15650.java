package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
중복이 없어야한다.
라는 건데..

 */
public class b15650 {
    static int n,m;
    static int arr[];
    static boolean isUsed[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        isUsed = new boolean[n+1];

        nAndM(0);

        System.out.println(sb);
    }
    public static void nAndM(int depth){
        if(m == depth){
            for(int val:arr){
                sb.append(val).append(" ");
            }
            sb.append('\n');
            return;
        }
        int st = 1;
        if(depth != 0) st = arr[depth - 1] + 1;
        for(int i = st; i <= n; i++){
            if(!isUsed[i]){
                isUsed[i] = true;
                arr[depth] = i;
                nAndM(depth+1);
                isUsed[i] = false;
            }
        }
    }

}

