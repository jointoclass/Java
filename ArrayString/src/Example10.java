public class Example10 {
    public static void main(String[] args) {
        // 아래 2차원 배열의 모든 값의 합과 평균을 출력하는 메서드
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        calculate2DArray(arr);
    }
    public static void calculate2DArray(int[][] arr) {
        int total = 0;
        float average = 0;


        System.out.println("total="+total); // 325
        System.out.println("average="+average); // 16.25
    }
}
