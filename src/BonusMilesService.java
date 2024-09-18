public class BonusMilesService {
    private static final int rubelsForBonusMiles = 20;

    public int calculate(int ticketPrice) {
        if (ticketPrice <= 0) {
            throw new IllegalArgumentException("Цена билета должна быть больше нуля");
        }
        return (int)(ticketPrice / rubelsForBonusMiles);
    }
}