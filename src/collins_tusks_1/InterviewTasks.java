package collins_tusks_1;

public class InterviewTasks {

    public static void main(String[] args) {
        int x = 1;
        int y = 0;
//        x++;
//        ++y;
        if (x++ > ++y) {
            System.out.println("Hello");
        } else {
            System.out.println("Welcome");
        }
        System.out.println("Log " + x + ":" + y);

    }
}
