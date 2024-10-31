public class RelationOperator {
    public static void main(String[] args) {
        // 비교연산자
        System.out.println(5<2); //false
        System.out.println(5>2); //true
        System.out.println(5<5); //false
        System.out.println(5<=5); //ture
        System.out.println(5>=5); //ture
        System.out.println();

        int a = 5;
        int b = 2;
        int c = 5;
        System.out.println(a==b); //false
        System.out.println(a!=b); //ture
        System.out.println(a==c); //true
        System.out.println(a!=c); // false
        System.out.println();

        // 중요 !!! 참조자료형의 참조비교
        String str1 = new String("안녕");
        String str2 = new String("안녕");
        System.out.println(str1 == str2);

        // 리터럴 방식의 문자열 생성과 비교
        String str3 = "안녕";
        String str4 = "안녕";
        System.out.println(str3 == str4);

        // 참조값의 복사후 비교
        String str5 = new String("안녕");
        String str6 = str5;
        System.out.println(str5 == str6);
    }
}
