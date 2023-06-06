package other;

public class PrintNums {

    public static void printNums(int n)
    {
        // initialising starting number
        int i, j, num=1;
        // outer loop to handle number of rows
        // n in this case
        for(i=0; i<n; i++)
        {
            for(j=0; j<=i; j++)
            {
                // printing num with a space
                System.out.print(num+ " ");

                // incrementing num at each column
                num = num + 1;
            }
            // ending line after each row
            System.out.println();
        }
    }
    // Driver Function
    public static void main(String args[])
    {
        int n = 5;
        printNums(n);
        String str = "abc gj1";
        int counter1 = 0, counter2=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            if (Character.isLetter(str.charAt(i))) {
                counter1++;
            }
            counter2++;
        }
        System.out.println("counter1 = " + counter1);
        System.out.println("counter2 = " + counter2);
    }
}
