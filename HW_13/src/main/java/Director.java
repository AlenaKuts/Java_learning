public class Director extends Manager{
    //Необходимо создать класс Director с теми же методами, что и Manager,
    //но метод getSalary должен возвращать результат по формуле - <базовая ставка> + <базовая ставка> * (<количество подчиненных> / 100 * 9).
    //Если количество подчиненных 0, то результат как у обычного рабочего.


    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public int getSalary(){
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        } else {
            return getBaseSalary() + getBaseSalary() * numberOfSubordinates/100 * 9;
        }
    }
}
