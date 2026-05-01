public class DiscountTask {
    public static void main(String[] args) {
        double price = 100;
        double discount10 = price - (price * 0.10);
        System.out.println("After 10% discount: " + discount10);

        double discount25 = price - (price * 0.25);
        System.out.println("After 25% discount: " + discount25);
    }
}
