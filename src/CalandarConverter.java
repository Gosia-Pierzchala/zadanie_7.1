public class CalandarConverter {
    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber){
        String day = "Dzien tygodnia";
        switch (dayNumber){
            case MONDAY:
                day = "Poniedzialek";
                break;
            case TUESDAY:
                day = "Wtorek";
                break;
            case WEDNESDAY:
                day = "Sroda";
                break;
            case THURSDAY:
                day = "Czwartek";
                break;
            case FRIDAY:
                day = "Piatek";
                break;
            case SATURDAY:
                day = "Sobota";
                break;
            case SUNDAY:
                day = "Niedziela";
                break;
        }
        return day;
    }
}