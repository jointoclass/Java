package Interface;

//연산인터페이스
// 추상클래스 대신 인터페이스를 활용한 여제
public interface Operation {
    int calculate(int a, int b);
}
class Add implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
class Subtract implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
