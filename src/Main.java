public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int bonus = 20;
        int miles = service.calculate(price, bonus); // 500 начисленных миль
        System.out.println(miles);
    }
}