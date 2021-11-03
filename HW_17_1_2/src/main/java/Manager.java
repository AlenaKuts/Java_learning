public final class Manager extends BaseManager{

    private static final int MULT = 3;

    public Manager(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    protected int getMult() {
        return MULT;
    }
}
