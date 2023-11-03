import java.util.Arrays;

class GenericMatrix<T> {
    T[][] data;

    public GenericMatrix(T[][] data) {
        this.data = data;
    }

    public T getElement(int row, int column) {
        return data[row][column];
    }

    public void setElement(int row, int column, T value) {
        data[row][column] = value;
    }

    public void printResult() {
        for (T[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }
}