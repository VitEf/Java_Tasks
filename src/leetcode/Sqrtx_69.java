package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sqrtx_69 {

    public static void main(String[] args) {
        System.out.println("mySqrt(4) = " + mySqrt(4));
//        System.out.println("mySqrt(8) = " + mySqrt(8));
        System.out.println("test(new ArrayList<>(Arrays.asList(1,23,5,6,8,7))) = " + test(new ArrayList<>(Arrays.asList(1, 23, 5, 6, 8, 7))));

    }

    public static int mySqrt(int x) {
        int y = 1;
        while(y!=x/y){
            y++;
        }
        return y;
    }

    static List<Integer> test(final List<Integer> num) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = num.size()-1; i >=0 ; i--) {
            res.add(num.get(i));
        }
        return res;
    }
}
