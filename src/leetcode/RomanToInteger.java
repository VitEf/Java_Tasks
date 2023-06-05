package leetcode;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println("romanToInt(\"III\") = " + romanToInt("III"));
        System.out.println("romanToInt(\"LVIII\") = " + romanToInt("LVIII"));
        System.out.println("romanToInt(\"MCMXCIV\") = " + romanToInt("MCMXCIV"));
        System.out.println("factorial(5) = " + factorial(5));
    }
    public static int romanToInt(String s) {
        int number = 0, ans = 0;
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case 'I':
                    number = 1; break;
                case 'V':
                    number = 5; break;
                case 'X':
                    number = 10; break;
                case 'L':
                    number = 50; break;
                case 'C':
                    number = 100; break;
                case 'D':
                    number = 500; break;
                case 'M':
                    number = 1000; break;
            }
            if (number > ans){
                ans -= number;
            }else{
                ans += number;  }
        }
        return ans;
    }

    static int factorial(int x){

        if (x==1){
            return x;
        }

        return x*factorial(x-1);
    }
}
