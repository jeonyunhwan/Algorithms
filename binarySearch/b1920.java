package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1920 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        arr = new int[N];

        for(int i = 0; i < N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬 시키기
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0;i<M;i++){
            if(binarySearch(Integer.parseInt(st.nextToken()))>=0){
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);

    }

    public static int binarySearch(int key){
        int pl = 0;
        int pr = arr.length -1;

        while (pl<=pr){
            int mid = (pl + pr) / 2;

            if(key < arr[mid]){
                pr = mid - 1;
            }else if(key > arr[mid]){
                pl = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
