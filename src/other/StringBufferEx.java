package other;

public class StringBufferEx {

    public StringBufferEx(String str) {
    }

    public static void main(String[] args) {
        System.out.println("reverseStringBuilder(\"null\") = " + reverseStringBuilder("null"));
        System.out.println(reverseString("null"));
        StringBuilder sb = new StringBuilder("null");
        System.out.println("sb.reverse() = " + sb.reverse());
        System.out.println("sb.reverse().toString() = " + sb.reverse().toString());

        StringBuffer sbf = new StringBuffer("null");
        System.out.println("sbf.reverse().toString() = " + sbf.reverse().toString());
        System.out.println("sbf.getClass() = " + sbf.getClass());
int a = 8;
int b = 9;
int c = 3;
        System.out.println(a>c&&b>c);
        System.out.println(a>c&&b<c);
    }

    static String reverseString(String str){
        String reverse = "";
        StringBuffer sb = new StringBuffer(str);
        reverse = sb.reverse().toString();
        return reverse;
    }

    static String reverseStringBuilder(String str){
        String reverse = new StringBuilder(str).reverse().toString();
        return reverse;
    }
}
