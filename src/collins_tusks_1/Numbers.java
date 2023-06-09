package collins_tusks_1;

public class Numbers {
    /*
                            1. Numbers -- Prime Number
                            Write a method that can check if a number is
                            prime or not
                            2. Numbers -- Armstrong numbers
                            Write a method that can check if a number is
                            Armstrong number
                            3. Number -- Reverse negative number
                            Write a return method that can reverse
                            negative number and return it as int
     */

    public static void main(String[] args) {

//        prime(153);
        armstrongNumber(1634);
        reverseNegativeNumber(-654321);
        allArmstrongNumbers(51345);
        armstrongNumber1(1634);
        armstrongNumber2(1000);
//        System.out.println("isArmstrong_N_Digits() = " + isArmstrong_N_Digits(371));
    }

    protected static void prime(int number) {
        int counter = 0;
        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(number + " is Prime");
            } else {
                System.out.println(number + " is not Prime");
            }
        } else {
            System.out.println(number + " is not Prime");
        }
    }

    protected static void armstrongNumber(int number) {
        int sum = 0;
        String[] arr = String.valueOf(number).split("");
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            sum += Math.pow(Integer.parseInt(arr[i]), l);
        }
        if (number == sum) {
            System.out.println(number + " is Armstrong Number");
        } else {
            System.out.println(number + " is NOT Armstrong Number");
        }
    }

    protected static void allArmstrongNumbers(int number) {



        for (int k = 0; k <= number; k++) {
            int sum = 0;
            String[] arr = String.valueOf(k).split("");
            int l = arr.length;
            for (int i = 0; i < l; i++) {
                sum += Math.pow(Integer.parseInt(arr[i]), l);
            }
            if (k == sum) {
                System.out.println(k + " is Armstrong Number");
            }
        }
    }

    protected static void armstrongNumber1(int number) {
        int a = 0;
        int l = 1;
        int c = 0;
        int x = 0;
        int sum = 0;
        int temp = number;
        for (int k = 1; k <= number; k *= 10) {
            a++;
            if (number - k < 0) {
                a = a / 10;
                break;
            }
        }
        for (int i = 1; i < a; i++) {
            l *= 10;
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 10; j++) {
                c = number - l * j;
                if (c < 0) {
                    x = j - 1;
                    number -= l * (j - 1);
                    l /= 10;
                    break;
                } else {
                    c = number;
                }
            }
            sum += Math.pow(x, a);
        }
        System.out.println(sum);
        if (sum == temp) {
            System.out.println(temp + " is Armstrong Number");
        } else {
            System.out.println(temp + " is NOT Armstrong Number");
        }
    }

    protected static void reverseNegativeNumber(int number) {
        if (number > 0) {
            System.out.println(number + " should be negative");
        } else {
            String[] arr = String.valueOf(number).split("");
            String num = "";
            for (int i = arr.length - 1; i > 0; i--) {
                num += "" + arr[i];
            }
            String temp = "-" + num;
            int n = Integer.parseInt(temp);
            System.out.println(n);
        }
    }

    protected static void armstrongNumber2(int number) {
        int a = 0;
        int l = 1;
        int c = 0;
        int x = 0;
        int sum = 0;

        int y = 1;
        for (int n = 1; n <= number; n++) {
            int temp = n;
            for (int k = 1; k <= n; k *= 10) {
                a++;
                if (n - k < 0) {
                    a = a / 10;
                    break;
                }
            }
            for (int i = 1; i < a; i++) {
                l *= 10;
            }
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= 10; j++) {
                    c = n - l * j;
                    if (c < 0) {
                        x = j - 1;
                        n -= l * (j - 1);
                        l /= 10;
                        break;
                    } else {
                        c = n;
                    }
                }
                for (int k = 0; k < a; k++) {
                    y = y * x;
                }
                sum += y;
                y = 1;
            }

            if (sum == temp && sum > 0) {
                System.out.println(temp + " is Armstrong Number");
            } else {
                //System.out.println(temp + " is NOT Armstrong Number");
            }
        }
    }

    public static boolean isArmstrong_N_Digits(int number) {    //  12345  == 1^5 + 2^5 + 3^5 + 4^5 + 5^5

        int initialNum = number;
        int summary = 0;
        int power = 0;
        do {
            power++;
            number /= 10;
        } while (number > 0);
        number = initialNum;
        do {
            summary += Math.pow(number % 10, power);
            number /= 10;
        } while (number > 0);
        System.out.println(372 % 10);
        System.out.println(37 % 10);
        System.out.println(3 % 10);

        return summary == initialNum;
    }

    public static boolean isArmstrong_N_Digits2(int number) {    //  12345  == 1^5 + 2^5 + 3^5 + 4^5 + 5^5

        int initialNum = number;    //   12345 -> "12345"  .length()
        int summary = 0;
        int power = 0;              //   power = String.valueOf(number).length();
        do {                        // 12345 //   1234  //   123  //  12   //   1
            power++;               //  1    //    2    //    3   //  4    //   5
            number /= 10;           //  1234 //    123  //   12   //  1    //   0
        } while (number > 0);
        number = initialNum;
        do {
            summary += Math.pow(number % 10, power);   // 5^5   //  4^5  //  3^5  // 2^5 // 1^5
            number /= 10;                               // 1234  //  123  //   12  // 1   //  0
        } while (number > 0);

        return summary == initialNum;
    }

    public static boolean isArmstrong(int number) {
        //you can convert number to string and you can get the numbers with split and
        //you can use wrapper classes
        //last digit
        int lastDigit = number % 10; // 153%10=3
        //second digit
        int result = number / 10; //result=153/10=15
        int secondDigit = result % 10; //15%10=5
        //third digit
        int thirdDigit = number / 100; //153/100 = 1
        int total = (lastDigit * lastDigit * lastDigit) + (secondDigit * secondDigit * secondDigit) + (thirdDigit * thirdDigit * thirdDigit);
        total = (int) (Math.pow(lastDigit, 3) + Math.pow(secondDigit, 3) + Math.pow(thirdDigit, 3));

        if (total == number)
            return true;
        else
            return false;
    }

    public static void armstrongNumbers(int number) {
        int a = number, b = number;
        int counter = 0;
        int sum = 0;
        int y = 1;
        int x = 0;

        do {
            counter++;
            a = a / 10;
        }while (a>0);
        System.out.println(counter);
        for (int i = 0; i < counter; i++) {
            x = number%10;
            for (int k = 0; k < counter; k++) {
                y=y*x;
            }
            sum+=y;
            y=1;
            number=number/10;
        }
        System.out.println(sum==b?b+" is Armstrong":b+" is NOT Armstrong");
    }
}

