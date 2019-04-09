import java.util.Arrays;
import java.util.stream.Stream;

public class TestApp {

    public boolean isEven(int num) {
        return num % 2 == 0 ? true : false;
    }

    public double circleArea(double radius) {
        double c = Math.PI * (radius * radius);
        return ((int) c);
    }
    public double triangleArea(double a, double h) {
        double s = (1/2) * a * h;
        return ((double) s);
    }

    public boolean isPrimeNum(int isNum) {
        if (isNum == 1)
            return false;
        for (int i = 2; i * i <= isNum; i++) {
            if (isNum % i == 0)
                return false;
        }
        return true;
    }

    public boolean array(int x, int y) {
        int sumOdd=0;
        int sumEven=0;
        int[] arr = new int [x];
        Arrays.stream(arr);
       // Stream.of(arr).map(z -> z % 2 == 0)
        for (int i = 0; i <x ; i++) {
            i=arr[i];

        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == i) {
                if (arr[i] % 2 == 0) {
                    sumEven += arr[i];
                } else
                    sumOdd += arr[i];
            }
            if (sumEven * sumEven > sumOdd) {
                if (sumEven < y) {
                    return true;
                }
            }
        }
        return true;
    }
}
