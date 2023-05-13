package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
N = 3 일때,
***
* *
***  -> 0,1 blank

N = 9 일때,
0,1 - > blank
....
 */
public class b2447 {
    static char[][] arr;

    static void star(int x, int y, int N, boolean blank){
        if(blank){
            // 공백일때
            for(int i = x;i < x + N;i++){
                for(int j = y; j < y + N;j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        if(N == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = N / 3;
        int cnt = 0;
        // 0,0,3,false 시작 - >
        /*
             1. 0,0,1,false -> * return
             2. 0,1,1,false -> * return
             3. 0,2,1,false -> * return
             4. 1,0,1,false -> * return
             5. 1,1,1 true -> ' ' return
             6. 1,2,1,false -> * return
             7. 2,0,1,false -> * return
             8. 2,1,1,false -> * return
             9. 2,2,1,false -> * return
             ***
             * *
             ***


         */
        for(int i = x; i < x + N;i += size){
            for(int j = y; j< y+ N; j += size){
                cnt++;
                if(cnt == 5){
                    star(i,j,size,true);
                }else{
                    star(i,j,size,false);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        star(0,0,N,false);

        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);

    }

}
