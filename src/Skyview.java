class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];
        int numscan = 0;
        for (int i = 0; i < numRows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < view[0].length; j++) {
                    view[i][j] = scanned[numscan];
                    numscan++;
                }
            } else {
                for (int j = view[0].length - 1; j > 0; j--) {
                    view[i][j] = scanned[numscan];
                    numscan++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0;
        int count = 0;
        for (int i = startRow; i <= endRow; i++)
            for (int j = startCol; j <= endCol; j++) {
                sum += view[i][j];
                count++;
            }
        return sum / (count);
    }
}
