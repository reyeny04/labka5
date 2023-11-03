public class Main {
    public static void main(String[] args) {
        ComplexMatrix matrix1 = new ComplexMatrix(new Complex[][]{
                {new Complex(1, 2), new Complex(3, 4)},
                {new Complex(5, 6), new Complex(7, 8)}
        });

        ComplexMatrix matrix2 = new ComplexMatrix(new Complex[][]{
                {new Complex(9, 10), new Complex(11, 12)},
                {new Complex(13, 14), new Complex(15, 16)}
        });

        ComplexMatrix resultAddition = matrix1.add(matrix2);
        ComplexMatrix resultMultiplication = matrix1.multiply(matrix2);

        System.out.println("Матрица 1:");
        matrix1.printResult();

        System.out.println("Матрица 2:");
        matrix2.printResult();

        System.out.println("Результат сложения матриц:");
        resultAddition.printResult();

        System.out.println("Результат умножения матриц:");
        resultMultiplication.printResult();
    }
}