package first;

public class Arctg {

    public double calculate(double x, int n) throws ArctgException {
        double result = 0;
        if (Math.abs(x) > 1)
            throw new ArctgException();

        for (int i = 1; i < n; i++) {
            result += Math.pow(-1, i-1) * Math.pow(x, 2*i-1) / (2*i -1);
        }
        return result;
    }
}
