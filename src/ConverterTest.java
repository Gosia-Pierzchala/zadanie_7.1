public class ConverterTest {
    public static void main(String[] args) {

        for (int dayNumber = 1; dayNumber < 8; dayNumber++) {
            String showDay = CalandarConverter.convertDayToString(dayNumber);
            System.out.println(dayNumber + " dzień tygodnia to " + showDay);
        }

    }
}