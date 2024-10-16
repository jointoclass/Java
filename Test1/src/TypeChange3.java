public class TypeChange3 {
    public static void main(String[] args) {
        int value1 = 3 + 5;  // 8
        int value2 = 8 / 5; //1
        float value3 = 3.0f + 5.0f; // 8.0
        double value4 = 8.0 / 5.0; //1.6

        byte data1 = 3;
        byte data2 = 5;
        //byte value5 = datal + data2;
        int value5 = data1 + data2;

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println();

        //int value6 = 3 = 3.5;
        double value6 = 5 + 3.5;
        int value7 = 5 + (int)3.5;

        double value8 = 5 / 2.0;
        byte data3 = 3;
        short data4 = 5;
        int value9 = data3 + data4; // 3+ 5 = 8
        double value10 = data3 + data4; //3.0 + 5.0 + 8.0
        

        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);
        System.out.println(value9);
        System.out.println(value10);
    }
}