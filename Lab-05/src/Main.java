public class Main {
    public static void main(String[] args) {
        Bundle holidayGiftBundle = new HolidayGiftBundle("Holiday Gift Bundle", "A perfect holiday gift");

        holidayGiftBundle.displayProductInfo();
        System.out.println("Total Price: $" + holidayGiftBundle.getPrice());
    }
}
