package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] m = {1, 3, 8, 11, 15, 17, 20, 21, 25, 30, 34};
        int n = 21;	// 찾을 값 지정

        int idx = binarySearch(m, n);	// 함수

        if ( idx != -1) {
            System.out.printf("m[%d] 위치에 있습니다.",idx);
        } else {
            System.out.print("찾는 값이 없습니다.");
        }
    }
    public static int binarySearch(int[] m, int n) {	// 배열 m 중에서 찾을 값 n 입력 받는다.
        int bottom = 0, top = m.length-1, middle;

        while ( bottom <= top ) {
            middle = (bottom + top) / 2;
            if ( m[middle] == n ) {	// 만약 중간 값이 찾고자 하는 값이라면
                return middle;
            } else if( m[middle] > n ){	// 찾고자 하는 값이 중간 값보다 작다면
                top = middle-1;
            } else if ( m[middle] < n ) {	// 찾고자 하는 값이 중간 값보다 크다면
                bottom = middle+1;
            }
        }
        return -1;	// 찾는 값이 없다면 -1을 가지고 return
    } //binarySearch
}
