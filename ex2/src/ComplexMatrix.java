class ComplexMatrix extends GenericMatrix<Complex> {
    public ComplexMatrix(Complex[][] data) {
        super(data);
    }

    public ComplexMatrix add(ComplexMatrix otherMatrix) {
        Complex[][] result = new Complex[otherMatrix.data.length][otherMatrix.data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result[i][j] = getElement(i, j).add(otherMatrix.getElement(i, j));
            }
        }
        return new ComplexMatrix(result);
    }

    public ComplexMatrix multiply(ComplexMatrix otherMatrix) {
        Complex[][] result = new Complex[otherMatrix.data.length][otherMatrix.data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result[i][j] = new Complex(0, 0);
                for (int k = 0; k < data[0].length; k++) {
                    result[i][j] = result[i][j].add(getElement(i, k).multiply(otherMatrix.getElement(k, j)));
                }
            }
        }
        return new ComplexMatrix(result);
    }

    public static ComplexMatrix zero(int rows, int columns) {
        Complex[][] data = new Complex[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = new Complex(0, 0);
            }
        }
        return new ComplexMatrix(data);
    }
}
