public class MainArg {
    public static void main(String[] args) {
        // 매인 메서드의 매개수를 활용하는 방법
        // (인탈리제이) 오른쪽 위의 ... 버튼 클릭
        // Run with parameters 클릭
        // program arguments 장애 매개변수를 차례대로 입력하고
        // 예시 ) hello 100 true 3.14
        // Run 버튼 클릭
        // 입력시 ' ' (스페이스)로 나눌 수 있음
        System.out.println(args.length); // 4
        System.out.println(args[0]); // hello
        System.out.println(args[1]); // 100
        System.out.println(args[2]); // true
        System.out.println(args[3]); // 3.14
    }
}
