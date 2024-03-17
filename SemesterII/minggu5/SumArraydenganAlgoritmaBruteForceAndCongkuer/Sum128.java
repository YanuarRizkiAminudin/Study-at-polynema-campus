package SumArraydenganAlgoritmaBruteForceAndCongkuer;
public class Sum128 {
    private int numElements;
    private double[] profits;
    private double total;

    public Sum128(int numElements) {
        this.numElements = numElements;
        this.profits = new double[numElements];
        this.total = 0;
    }

    // Metode untuk menghitung total keuntungan menggunakan algoritma Brute Force
    public double totalBF(double[] profits) {
        for (int i = 0; i < numElements; i++) {
            total += profits[i];
        }
        return total;
    }

    // Metode untuk menghitung total keuntungan menggunakan algoritma Divide and Conquer
    public double totalDC(double[] profits, int left, int right) {
        if (left == right) {
            return profits[left];
        } else if (left < right) {
            int mid = (left + right) / 2;
            double leftSum = totalDC(profits, left, mid - 1);
            double rightSum = totalDC(profits, mid + 1, right);
            return leftSum + rightSum + profits[mid];
        }
        return 0;
    }
}
