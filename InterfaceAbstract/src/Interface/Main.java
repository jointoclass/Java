package Interface;

public class Main {
    public static void main(String[] args) {
        // 자식클래스로 생성자를 이용하여 인터페이스타입의 가진 인스턴스 생성
        Operation o1 = new Add();
        Operation o2 = new Subtract();
        System.out.println(o1.calculate(1,2)); // 3
        System.out.println(o2.calculate(5,3)); // 2


    }
}