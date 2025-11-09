package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elementData[size] = e;
        size++;
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
배열의 불편한 점
1. 배열의 길이를 동적으로 변경할 수 없다.
2. 데이터를 추가하기 불편하다.

배열의 이런 불편한 점을 해소하고 동적으로 데이터를 추가할 수 있는 자료구조를 LIST(리스트)라 한다.

LIST
- 순서가 있고, 중복을 허용하는 자료구조를 리스트라 한다.
- 일반적으로 배열과 리스트는 구분해서 이야기한다. 리스트는 배열보다 유연한 자료구조로, 크기가 동적으로 변할 수 있다.
- 중복 허용한다는 뜻은 같은 데이터를 입력할 수 있다는 것이다. (set은 중복을 허용하지 않는 자료구조)
 */
