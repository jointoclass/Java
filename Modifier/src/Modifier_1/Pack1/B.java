package Modifier_1.Pack1;

public class B {
    public void print() {
        A a = new A();
        System.out.print(a.a + " ");
        System.out.println(a.b + " ");
        System.out.println(a.c + " ");
        // System.out.println(a.d + " ");  // private 다른 클래스에서 접근 불가 // 접근 지정자 개념
        System.out.println();
    }
}
