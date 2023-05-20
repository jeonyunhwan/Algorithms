package Backtracking.NMseries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class b15663 {
    static int n,m;
    static LinkedHashSet<String> hash;
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
        numArr = new int[n];
        isUsed = new boolean[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0;i < n;i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArr);
        solution(0);
        System.out.println(sb);
    }

    public static void solution(int depth){
        //base - condition
        if(m == depth){
            for(int val : arr){
                sb.append(val).append(" ");
            }
            sb.append('\n'); return;
        }
        int before = 0;
        for(int i = 0; i <n; i++){
            if(!isUsed[i]){
                // 중복 처리를 위하여 before
                if(before != numArr[i]) {
                    isUsed[i] = true;
                    arr[depth] = numArr[i];
                    before = numArr[i];
                    solution(depth + 1);
                    isUsed[i] = false;
                }

            }
        }

    }
}
