public abstract class BaseManager extends Worker{

    public BaseManager(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    private int numberOfSubordinates;

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }

    protected abstract int getMult();

    @Override
    public int getSalary(){
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates()/100 * getMult());
        }
    }

}
