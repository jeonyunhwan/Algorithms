package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1780 {
    static int zero = 0;
    static int one = 0;
    static int minusOne = 0;
    static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        StringTokenizer st;

        for(int i = 0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0;j<N;j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        findNumber(0,0,N);
        System.out.println(minusOne);
        System.out.println(zero);
        System.out.println(one);

    }
    public static void findNumber(int row,int col,int size){
        if(numberCheck(row, col, size)){
            if(paper[row][col]==0) zero++;
            else if(paper[row][col]==1) one++;
            else minusOne++;
            return;
        }
        int reSize = size / 3;

        findNumber(row,col,reSize);
        findNumber(row,col+reSize,reSize);
        findNumber(row,col+(reSize*2),reSize);

        findNumber(row+reSize,col,reSize);
        findNumber(row+reSize,col+reSize,reSize);
        findNumber(row+reSize,col+(reSize*2),reSize);

        findNumber(row+(reSize*2),col,reSize);
        findNumber(row+(reSize*2),col+reSize,reSize);
        findNumber(row+(reSize*2),col+(reSize*2),reSize);

    }
    public static boolean numberCheck(int row,int col,int size){
        int color = paper[row][col];
        for(int i=row;i<row+size; i++){
            for(int j=col;j<col+size;j++){
                if(color != paper[i][j]) return false;
            }
        }
        return true;
    }
}
