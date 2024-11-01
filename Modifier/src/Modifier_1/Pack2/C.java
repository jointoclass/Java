package Modifier_1.Pack2;


import Modifier_1.Pack1.A;

public class C {
    public void print() {
        A a = new A();
        System.out.print(a.a + " ");
        //System.out.print(a.b + " "); // protected 외부패키지 read/write불가
        //System.out.print(a.c + " "); // default 외부패키지 read/write불가
        //System.out.print(a.d + " "); // private 외부클래스 read/write불가
        System.out.println();
    }
}
