public class Main {
    public static void main(String[] args) {
        int ticket = 13_676;
        int forMiles = 20;

        int bonus = (ticket / forMiles);

        System.out.println("Начислено " + bonus + " бонусных миль");
    }
}