public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int refill = 2000;
        int bonus;
        int total;

        if (refill < 1000) {
            bonus = 0;
            System.out.println(bonus);
        } else {
            bonus = refill / 100;
            System.out.println(bonus);
        }

        System.out.println(total = balance + refill + bonus);
    }
}