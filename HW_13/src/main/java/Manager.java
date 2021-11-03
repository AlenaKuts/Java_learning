public class Manager extends Worker{
    ///Необходимо создать класс Manager в который нужно добавить следующие методы:
    //getNumberOfSubordinates - получить количество подчиненных
    //setNumberOfSubordinates
    //в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> + <базовая ставка> * (<количество подчиненных> / 100 * 3).
    // Если количество подчиненных 0, то результат как у обычного рабочего.


    public Manager(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    protected int numberOfSubordinates;

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;

    }

    @Override
    public int getSalary(){
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        } else {
            return getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates()/100 * 3);
        }
    }


}
