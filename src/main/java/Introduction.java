import java.time.LocalDateTime;

public class Introduction {

    private static final String GOOD_NIGHT = "Good night!\n";
    private static final String GOOD_MORNING = "Good morning!\n";
    private static final String GOOD_DAY = "Good day!\n";
    private static final String GOOD_EVENING = "Good evening!\n";

    public static void main(String[] args) {

        int hour = LocalDateTime.now().getHour();

        System.out.println(
                (hour > 22 || hour < 6)
                ? GOOD_NIGHT
                : (hour > 6 && hour < 12)
                    ? GOOD_MORNING
                    : (hour > 12 && hour < 18)
                        ? GOOD_DAY
                        : GOOD_EVENING
        );
//
//        if (hour > 22 || hour < 6) {
//            System.out.println(GOOD_NIGHT);
//        } else if (hour > 6 && hour < 12) {
//            System.out.println(GOOD_MORNING);
//        } else if (hour > 12 && hour < 18) {
//            System.out.println(GOOD_DAY);
//        } else {
//            System.out.println(GOOD_EVENING);
//        }

        System.out.println("Go to the selection of goods - press 1");
        System.out.println("Return - press 2");
        Press.answer();
    }
}
