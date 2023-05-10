package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
이분탐색에서의 중복 원소 처리
lowerbound, upperbound

 */
public class b10816 {
    public static int arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        arr = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0;i<M;i++){
            int key = Integer.parseInt(st.nextToken());

            sb.append(upperbound(arr,key) - lowerbound(arr,key)).append(' ');
        }
        System.out.println(sb);
    }
    public static int lowerbound(int arr[], int key){
        int pl = 0;
        int pr = arr.length;

        //pl 과 pr 이 같을 때까지 반복
        while(pl < pr){
            int mid = pl + ((pr - pl) / 2);
            /*
            upperbound 구현
             */
            if(key <= arr[mid]){
                pr = mid;
            }else{
                pl = mid+1;
            }
        }
        return pl;
    }
    public static int upperbound(int arr[], int key){
        int pl = 0;
        int pr = arr.length;

        while(pl < pr){
            int mid = pl + ((pr - pl) / 2);

            if(key < arr[mid]){
                pr = mid;

            }
            else{
                pl = mid + 1;
            }
        }
        return pl;
    }
}
