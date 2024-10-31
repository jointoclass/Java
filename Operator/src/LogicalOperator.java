public class LogicalOperator {
    public static void main(String[] args) {
        // 논리연산자 ( &&,||,^, !)
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(true && false); // false
        System.out.println((5 <= 5) && (7 > 2)); // true
        System.out.println();

        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || (5<3)); //false
        System.out.println((5<=5) || (7>2)); //true
        System.out.println();

        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ (5<3)); // false
        System.out.println((5<=5) ^ (7>2)); // false
        System.out.println();

        System.out.println(!true); // false
        System.out.println(!false); // ture
        System.out.println(false || !(5<3)); // ture
        System.out.println((5<=5) || !(7>2)); // true(쇼트서킷('||'이거 앞에가 true이면))

        // 쇼트서킷
        int value1 = 3;
        System.out.println(false && ++value1>6); // false
        System.out.println(value1); // 3 쇼트서킷이 발생하여 ++value1 실행안됨



    }
}
