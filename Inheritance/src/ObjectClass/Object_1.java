package ObjectClass;

class MyClass extends Object {

}

public class Object_1 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        //모든 클래스는 Object 클래스의 자식
        //Object가 가지고 있는 메서드를 사용할 수 있음 (오버라이딩도 가능)
        System.out.println(myClass.toString()); // ObjeckClass.MYClass@2f4d3
        System.out.println(myClass);
    }
}
