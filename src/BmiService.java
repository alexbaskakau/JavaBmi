public class BmiService {
    public int calculate(double a, double b ) {
        int index = (int) (a / (Math.pow(b,2)));
        return index;

    }

}
