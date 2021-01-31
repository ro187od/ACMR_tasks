package ACMP_33;

public class Field {
    public static void main(String[] args) {
        Gangster harry = new Gangster("Harry");
        Gangster larry = new Gangster("Larry");

        harry.setNumberOfShootedBanks(7);
        larry.setNumberOfShootedBanks(4);

        Judge judge = new Judge();
        judge.calculateHowManyBanksWereShooted(harry, larry);

        System.out.println(harry.getName() + " не дострелял: " +
                judge.sayHowManyBanksWereNotShootedBy(harry) + " банок :(");
        System.out.println(larry.getName() + " не дострелял: " +
                judge.sayHowManyBanksWereNotShootedBy(larry) + " банок :(");
    }
}
