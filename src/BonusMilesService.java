public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20;
        int miles = (int) price / bonus;
        return miles;
    }
}
