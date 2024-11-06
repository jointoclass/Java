public class Test {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "melon", "grape"};
        System.out.println(findWordsStartingWith(arr, 'a')); // apple
        System.out.println(findWordsStartingWith(arr, 'b')); // banana
        System.out.println(findWordsStartingWith(arr, 'c')); // 없음
    }
    public static String findWordsStartingWith(String[] arr, char ch) {
//        for (int i=0; i< arr.length; i++) {
//            if (arr[i].charAt(0) == ch) {
//                return arr[i];
//            }
//        }
        for (int i=0; i< arr.length; i++) {
            if (arr[i].indexOf(ch) == 0) {
                return arr[i];
            }
        }
        return "없음";
    }
}
