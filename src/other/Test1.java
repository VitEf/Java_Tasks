package other;

public class Test1 {

    public static void main(String[] args) {
        String input = "a1b2c3d4";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int count = i;

            for (int j = 0; j < count; j++) {
                output.append(c);
            }

            if (i < input.length() - 1) {
                output.append('-');
            }
        }

        System.out.println(output.toString());
        System.out.println("convertString(\"a1b2c3d4\") = " + convertString("a1b2c3d4"));
    }

    public static String convertString(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i += 2) {
            char c = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                output += c;
            }
        }
        return output;
    }



}
