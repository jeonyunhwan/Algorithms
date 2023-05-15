package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2630 {
    static int white = 0;
    static int blue = 0;
    static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        StringTokenizer st = null;
        for(int i = 0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0;j<N;j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        findColor(0,0,N);
        System.out.println(white);
        System.out.println(blue);

    }
    public static void findColor(int row,int col,int size){

        if(colorCheck(row,col,size)){
            if(paper[row][col] == 0)  white++;
            else blue++;
            return;
        }

        int newSize = size/2;
        findColor(row,col,newSize);
        findColor(row,col+newSize,newSize);
        findColor(row+newSize,col,newSize);
        findColor(row+newSize,col+newSize,newSize);

    }
    public static boolean colorCheck(int row,int col,int size){

        int color = paper[row][col];

        for(int i = row; i < row + size;i++){
            for(int j = col;j < col + size;j++){
                if(color != paper[i][j]) return false;
            }
        }
        return true;
    }

}
