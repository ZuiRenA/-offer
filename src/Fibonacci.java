import java.util.Scanner;

public class Fibonacci {
    public int Fibonacci(int n) {
        int result = getInt(n);
        return result;
    }

    private int getInt(int num) {
        if (num < 0)
            return -1;
        else if (num == 0)
            return 0;
        else if (num == 1)
            return 1;


        int f0 = 0, f1 = 1, f2 = 0;
        for (int i = 2; i <= num; i++){
            f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
        }

        return f2;
    }
}
