package P1029;

public class FlexibleSize {
    public static void main(String[] args) {
        // #1. method1(int... value)
        method1(1,2);
        method1(1,2,3);
        method1(1,2,3,4,5);
        method1();
        // #2. method2(String... values
        method2("안녕", "방가");
        method2("땡큐", "베리", "감사");
        method2();
    }
 //   public static void method1(int a, int b){
 //
 //   }
 //   public static void method1(int a, int b, int c){
 //
 //   }
 //   public static void method1(int a, int b, int c, int d, int e) {
 //
 //   }

    public static void method1(int... values){
        for(int i=0; i<values.length; i++) {
            System.out.print(values[i] + " "); // 값이 옆으로 적히지만
        }
        System.out.println(); // 마지막에 이렇게 넣어주면 값이 끝날때마다 라인이 끈어짐!
    }
    public static void method2(String... values) {
        for(int i=0; i< values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}









