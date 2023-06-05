package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
A를 활용해서 계산을 생각했는데,
B를 통해서 거꾸로 나가야 한다는 것을 끄적거리다가 깨닫게 됨.
1. A == B 가 같으면 break;
   A > B break -1 루프를 돌면 된다.
2. 1의 자리수가 1일때 B/10
3. 1의 자리가 짝수면 B/2
4. 만약 1의 자리가 1도 아니고 홀수이면 break; -1

 */
public class b16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int count = 1;

        while(true){
            if(A == B) break;
            if(B < A) {
                count = -1;
                break;
            }
            if(B % 2 == 0){
                B/=2;
            }else if(B % 10 == 1){
                B /= 10;
            }else{
                count = -1;
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
