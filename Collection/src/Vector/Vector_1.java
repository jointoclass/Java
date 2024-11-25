package Vector;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

// List인터페이스의 두번째 구현클래스 LinkedList 사용법
// 요소를 노드(=node)라는 데이터구조에 저장함
// 각 노드는 데이터와 다음 노드에 대한 참조를 저장함
// 주요특징
// 1. 동적크기 : 필요할때마다 노드를 연속된 위치가 아니더라도 추가 가능.
//              리스트를 재생성할 필요가 없음
// 2. 빠른 삽입/삭제 : 리스트 중간에서도 참조값만 수정하여 삽입/삭제 가능
// 3. 느린 접근(엑세스) : 임의의 위치를 접근하려면 반드시 순차적으로 탐색해야함
// 4. 메모링 오버헤드 : 각 노드에 메모리참조값을 저장하기 위한 추가 메모리 필요
public class Vector_1 {
    public static void main(String[] args) {
        List<Integer> vector1 = new Vector<>();

        // #1. add
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        System.out.println(vector1); // [3,4,5]
        // #2. add 중간 삽입
        vector1.add(1, 6);
        System.out.println(vector1); // [3,6,4,5]
        // #3. addAll 뒤에 리스트 추가
        List<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2); // [1,2]
        vector2.addAll(vector1);
        System.out.println(vector2); // [1,2,3,6,4,5]
        // #4. addAll 중간에 리스트 삽입
        List<Integer> vector3 = new Vector<>();
        vector3.add(1);
        vector3.add(2);
        vector3.addAll(1, vector3);
        System.out.println(vector3); // [1,1,2,2]
        // #5. set 수정
        vector3.set(1, 5);
        vector3.set(3, 6);
        System.out.println(vector3); // [1,5,2,6]
        // #6. remove(int index) 인덱스로 삭제
        vector3.remove(1);
        System.out.println(vector3); // [1,2,6]
        // #7. remove(Object o) 값으로 삭제
        vector3.remove(Integer.valueOf(2));
        System.out.println(vector3); // [1,6]
        // #8. clear 전체삭제
        vector3.clear();
        System.out.println(vector3); // []
        // #9. inEmpty 리스트가 비었는지 확인 (참 또는 거짓 리턴)
        System.out.println(vector3.isEmpty()); // true
        // #10. size 리스트내 요소의 갯수
        System.out.println(vector3.size()); // 0
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);
        System.out.println(vector3.size()); // 3
        // #11. get 읽기
        for (int i = 0; i < vector3.size(); i++) {
            System.out.println(vector3.get(i));
        }
        // #12. toArray 리스트를 배열로 타입변환
        // toArray는 오브젝트의 배열을 리턴하므로 오브젝트의 배열 타입으로 받아야함
        Object[] objects = vector3.toArray();
        System.out.println(Arrays.toString(objects)); // [1,2,3]
        // #13. toArray (Integer의 배열로 받으려면 별도의 명시를 해줘야함)
        Integer[] integers = vector3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers)); // [1,2,3]
    }
}
