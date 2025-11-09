package collection.array;
/*
V4 - 제네릭 클래스로 변경
앞서 만든 MyArrayList 들은 Object 를 입력 받기 떄문에 아무 데이터나 입력할 수 있고, 또 결과로 Object를 반환한다.
따라서 필요한 경우 다운 캐스팅을 해야하고, 타입 안전성이 떨어지는 단점이 있다.
 */
import java.util.Arrays;

public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        if (size==elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(int index, E e) {
        if (size==elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private void shiftRightFrom(int index) {
        for (int i=size; i>index; i--) {
            elementData[i] = elementData[i-1];
        }
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i=index; i<size-1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    public int indexOf(E o) {
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
    MyArrayList의 단점
    배열을 사용한 리스트인 MyArrayList는 다음과 같은 단점이 있다.
    1. 정확한 크기를 미리 알지 못하면 메모리가 낭비된다. 배열을 사용하므로 배열 뒷 부분에 사용되지 않고, 낭비되는 메모리가 있다.
    2. 데이터를 중간에 추가하거나 삭제할 때 비효율적이다.
        - 이 경우 데이터를 한 칸씩 밀어야 한다. 이것은 O(n)으로 성능이 좋지 않다.
        - 만약 데이터의 크기가 1,000,000건이라면 최악의 경우 데이터를 추가할 때 마다 1,000,000건의 데이터를 밀어야 한다.
 */