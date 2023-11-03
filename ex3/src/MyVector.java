import java.util.Arrays;

class MyVector extends MyCollection {
    private int[] array;
    private int size;

    public MyVector() {
        this.array = new int[10];
        this.size = 0;
    }

    public MyVector(int[] a) {
        this.array = Arrays.copyOf(a, a.length);
        this.size = a.length;
    }

    @Override
    public void add(int element) {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
        array[size++] = element;
    }

    @Override
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = element;
        size++;
    }

    public void clear() {
        size = 0;
        array = new int[10];
    }

    public boolean contains(int o) {
        for (int i = 0; i < size; i++) {
            if (array[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return array[index];
    }

    public int indexOf(int o) {
        for (int i = 0; i < size; i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insertElementAt(int element, int index) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    @Override
    public void remove(int element) {

    }

    @Override
    public void removeAll(int element) {

    }

    public void reverse() {
        int left = 0;
        int right = size - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    @Override
    public void set(int index, int element) {

    }

    @Override
    public int size() {
        return 0;
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public int[] toArray() {
        return Arrays.copyOf(array, size);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}