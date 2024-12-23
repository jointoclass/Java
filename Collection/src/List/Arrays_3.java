package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ArrayList의 사용법 (메서드사용법)
public class Arrays_3 {
    public static void main(String[] args) {
        List<Integer> aList1 = new ArrayList<>();
        // #1. add (요소추가, 맨뒤에 추가)(
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println(aList1); // [3,4,5]
        // #2. add (int index, E element) (요소추가, 특정 위치에 추가)
        aList1.add(1, 6);
        System.out.println(aList1); // [3,6,4,5]
        // #3. addAll ( 또 다른 리스트를 뒤에 추가)
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(1);
        aList2.add(2);
        aList2.addAll(aList1);
        System.out.println(aList2); // [1, 2, 3, 6, 4, 5]
        // #4. addAll (특정위체에 리스트 추가)
        List<Integer> aList3 = new ArrayList<>();
        aList3.add(1);
        aList3.add(2); // [1,2]
        aList3.addAll(1, aList3);
        System.out.println(aList3); // [1,1,2,2]
        // #5. set (수정)
        aList3.set(1,5);
        aList3.set(3,6);
        System.out.println(aList3);
        // #6. remove (int index) 해당 인덱스의 요소 삭제
        // (주의)정수의 리스트인 경우에는 정수를 매개변수에 넣으면 인덱스로 인식함!!
        aList3.remove(1); // 1이 아니라 5가 삭제됨
        System.out.println(aList3); // [1, 2, 6]
        // #7. remove(Object o) 해당 요소를 찾아서 삭제
        aList3.remove(Integer.valueOf(2));
        System.out.println(aList3); // [1, 6]
        // #8. clear 보두 삭제
        aList3.clear();
        System.out.println(aList3); // []
        // #9. isEmpty 요소가 있는지 없는지 확인할때 사용. 비었으면 true리턴
        System.out.println(aList3.isEmpty()); // true
        // #10. size 리스트의 요소 갯수를 리턴
        System.out.println(aList3.size()); // 0
        aList3.add(1);
        aList3.add(2);
        aList3.add(3);
        System.out.println(aList3); // [1, 2, 3]
        System.out.println(aList3.size()); // 3
        // #11. get 리스트의 요소를 읽음
        // *** <주의> List를 배열처럼 인덱스[i]로 읽으면 안됨!!! ***
        //System.out.println(aList3[0]);
        System.out.println(aList3.get(0)); // 1
        System.out.println(aList3.get(1)); // 2
        System.out.println(aList3.get(2)); // 3
        // 반복문은 사용법이 다르기 때문에 반드시 숙지해야함!!
        for (int i=0; i<aList3.size(); i++) {
            System.out.println(aList3.get(i));
        }
        // #12. toArray 리스트를 배열로 타입변환
        Object[] objects = aList3.toArray();
        // 아래와 같이 타입변화하는 것은 매우 위험함!!
        // Object의 약한(느슨한) 타입체크로 인해 정상 동작을 담보할 수 없음
        //Integer[] integers = (Integer[]) aList3.toArray();
        System.out.println(Arrays.toString(objects)); // [1,2,3]
        // 그럼 어떻게 타입변환해야 안전한가?
        Integer[] integers = aList3.toArray(new Integer[0]);
        // new Integer[0]는 0의 length를 가진 배열을 만드는게 아니라
        // aList3.size()와 같은 배열크기로 만들라는 약속!!
        System.out.println(Arrays.toString(integers)); // [1, 2, 3]
    }
}
