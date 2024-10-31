public class Example2 {
    public static void main(String[] args) {
        //주어진 배열의 평균값을 계산하는 메서드
        int[] numbers = {1,2,3,4,5};
        System.out.println(calcuateAverage(numbers)); // 3
    }
    public static double calcuateAverage(int[] arr) {
                int sum = 0;
                for (int i=0; i<arr.length; i++) {
                    sum = sum + arr[i];
                }
                 double average = (double)sum / arr.length;
                return average;
    }
}
