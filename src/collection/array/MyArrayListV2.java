package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        // 코드 추가
        if (size==elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i=0; i<size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size + ", capacity=" + elementData.length;
    }
}
/*
capacity 값을 초과한 상태에서 데이터를 추가하면 런타임 오류가 발생한다.
그래서, capacity 값과 size 값이 같은 경우 grow() 메서드를 호출한다.
1. 2배 큰 배열을 새로 생성한다.
2. 새로운 배열에 기존 배열의 값을 복사한다.
3. Arrays.copyOf(기존배열, 새로운길이)를 사용해서 2배 큰 배열을 새로 생성하면서 새로운 배열에 기존 배열의 값을 복사한다.
4. 이렇게 되면 내부 데이터를 보관하는 elementData는 기존보다 2배 큰 capacity를 가진 배열을 보유하게 된다.
5. elementData의 참조값을 새로 생성한 배열의 주소로 변경해줘야 한다.
6. 기존 배열은 더는 참조하는 곳이 없으므로 GC 대상이 된다.

grow() 메서드
1. 데이터가 하나 추가될 때 마다 배열의 크기를 1씩만 증가하게 되면 배열을 복사하는 연산이 너무 자주 발생한다.
2. 배열을 새로 복사해서 만드는 연산은 배열을 새로 만들고 또 기존 데이터를 복사하는 시간이 걸리므로 가능한 줄이는 것이 좋다.
   반면에 배열의 크기를 너무 크게 증가하면 사용되지 않고 낭비되는 메모리가 많아지는 단점이 있다.
3. 참고로 실제로는 보통 50% 정도 증가하는 방법을 사용한다.
 */