package Backtracking.NMseries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b15649 {
    static int n,m;
    static int arr[];
    static boolean isUsed[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        isUsed = new boolean[n+1];
        nAndM(0);

        System.out.println(sb);

    }
    public static void nAndM(int k){
        // base-condition
        if(k==m){
           for(int i = 0;i<m;i++){
               sb.append(arr[i]).append(" ");
           }
           sb.append('\n');
           return;
        }

        for(int i = 1;i<=n;i++){
            if(!isUsed[i]){
                arr[k] = i;
                isUsed[i] = true;
                nAndM(k+1);
                // 방문 했으니까
                isUsed[i] = false;
            }
        }

    }
}
