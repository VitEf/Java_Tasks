package collins_tusks_1;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "\nb = " + b);

        System.out.println("========================================");

        String numbers15 = "";
        String numbers5 = "";
        String numbers3 = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0 && i % 5 == 0 && i % 3 == 0) {
                numbers15 += " " + i;
            }
            if (i % 5 == 0) {
                if (i % 15 != 0) {
                    numbers5 += " " + i;
                }
            }
            if (i % 3 == 0) {
                if (i % 15 != 0 && i % 5 != 0) {
                    numbers3 += " " + i;
                }
            }
        }
        System.out.println("Divisible by 15:" + numbers15);
        System.out.println("Divisible by 5:" + numbers5);
        System.out.println("Divisible by 3:" + numbers3);

        System.out.println("========================================");

        String codilityTestCoders = "";
        int u = 24;
        for (int i = 1; i <= u; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                codilityTestCoders += " CodilityTestCoders ";
            } else if (i % 2 == 0 && i % 3 == 0) {
                codilityTestCoders += " CodilityTest ";
            } else if (i % 3 == 0 && i % 5 == 0) {
                codilityTestCoders += " TestCoders ";
            } else if (i % 3 == 0) {
                codilityTestCoders += " Test ";
            } else if (i % 2 == 0) {
                codilityTestCoders += " Codility ";
            } else if (i % 5 == 0) {
                codilityTestCoders += " Coders ";
            } else {
                codilityTestCoders += " " + i;
            }
        }
        System.out.println(codilityTestCoders.trim());

    }
    public int[] makePi() {
        return new int[]{3,1,4};

    }
}
/*
avapublic class TestFromCollins {


    public static void main(String[] args) {

        swapNumbers(3, 6);
        divide_3_5_15();
        consecutiveNumbers(50);

    }


        public static void swapNumbers(int num1, int num2) {

            System.out.println("num1= " + num1 + " / num2= " + num2);

            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;

            System.out.println("num1= " + num1 + " / num2= " + num2);
         }


         public static void divide_3_5_15 () {

            String divBy3 = "", divBy5 = "", divBy3_5_15 = "";

            for ( int i = 1; i <= 100; i++ ) {

                if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0 ) {
                    divBy3_5_15 += i + " ";
                }  else if (i % 3 == 0) {
                    divBy3 += i + " ";
                } else if (i % 5 == 0) {
                    divBy5 += i + " ";
                }
            }
             System.out.println("divBy3_5_15 = " + divBy3_5_15);
             System.out.println("divBy5 = " + divBy5);
             System.out.println("divBy3 = " + divBy3);

         }


        public static void  consecutiveNumbers(int forNum) {

            String output = "";
            for (int i = 1; i <= forNum; i ++) {


                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                    output += i;
                } else {
                    if (i % 2 == 0) {
                        output += "Codility";
                    }
                    if (i % 3 == 0) {
                        output += "Test";
                    }
                    if (i % 5 == 0) {
                        output += "Coders";
                    }
                }
                output += "\n";
            }
            System.out.println(output);
        }


}
 */
