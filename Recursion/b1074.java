package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1074 {
    static int cnt = 0;
    public static void func(int n,int r,int c){
        if(n==1) return;
        int size = n/2;

        if(r < size && c < size) func(size,r,c);
        else if(r < size && c >= size){
            cnt += n * n / 4;
            func(size,r,c - size);
        }
        else if(r >= size && c < size){
            cnt += (n * n / 4) * 2;
            func(size,r - size,c);
        }else{
            cnt += (n * n / 4) * 3;
            func(size,r-size,c-size);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n  = (int)Math.pow(2,N);
        func(n,r,c);
        System.out.println(cnt);
    }
}
