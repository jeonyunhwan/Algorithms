package Backtracking.NMseries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b15655 {
    static int n,m;
    static int[] arr;
    static int[] numArr;
    static boolean[] isUsed;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        isUsed = new boolean[n];
        numArr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArr);
        solution(0,0);
        System.out.println(sb);
    }

    public static void solution(int depth,int start){
        //base condition
        if(m == depth){
            for(int val : arr){
                sb.append(val).append(" ");
            }
            sb.append('\n'); return;
        }

        for(int i = start;i<n;i++){
            if(!isUsed[i]){
                isUsed[i] = true;
                arr[depth] = numArr[i];
                solution(depth+1,i);
                isUsed[i] = false;
            }
        }
    }
}
