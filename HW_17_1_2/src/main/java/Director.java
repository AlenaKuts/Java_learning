public class Director extends BaseManager{

    private static final int MULT = 9;

    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    protected int getMult() {
        return MULT;
    }
}
