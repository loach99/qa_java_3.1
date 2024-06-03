public class BonusMilesService {
    public int calculate(int price) {

        int bonus = 20; // стоимость одной мили
        int miles = price / bonus; // формула расчета бонусных миль

        return miles;

    }
}