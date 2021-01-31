package ACMP_33;

import java.util.Objects;

public class Judge {

    private int totalNumberOfShootedBanks;

    public Judge() {
        this.totalNumberOfShootedBanks = 0;
    }

    public void calculateHowManyBanksWereShooted(Gangster harry, Gangster larry) {
        this.totalNumberOfShootedBanks = harry.getNumberOfShootedBanks() +
                larry.getNumberOfShootedBanks() - 1;
    }

    public int sayHowManyBanksWereNotShootedBy(Gangster currentGangster) {
        return totalNumberOfShootedBanks -
                currentGangster.getNumberOfShootedBanks();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Judge judge = (Judge) o;
        return totalNumberOfShootedBanks == judge.totalNumberOfShootedBanks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNumberOfShootedBanks);
    }
}
