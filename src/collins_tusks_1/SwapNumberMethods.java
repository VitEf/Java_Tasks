package collins_tusks_1;

public class SwapNumberMethods {

    public static void main(String[] args) {

        swap1(12, 15);
        swap2(5, 9);
        swapNumbers(56,95);
        swap1(-45,3);
        System.out.println("reverseNo(546879) = " + reverseNo(546879));
        System.out.println("factorial(5) = " + factorial(9));

    }
    static void swap2(int a, int b) {
        System.out.println("Numbers before: a = " + a + "| b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after: a = " + a + "| b = " + b);
    }
    
    static void swap1(int a, int b) {
        System.out.println("Numbers before: a = " + a + "| b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after: a = " + a + "| b = " + b);
    }

    public static int reverseNo(int number) {
        int reversed = 0;

        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return  reversed;
    }



    public static void swapNumbers(int x, int y) {
        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println("One:" + x + " Two: " + y);

    }

    public static int factorial(int num) {
        if (num <= 2) {
            return num;
        }
        return num * factorial(num - 1);
    }
}
