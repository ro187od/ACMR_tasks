package ACMP_33;

public class Gangster {
    private String name;
    private int numberOfShootedBanks;
    public static String gangsterFamilyName = "Barkovsky";

    @Override
    public String toString() {
        return "Gangster{" +
                "name='" + name + '\'' +
                ", numberOfShootedBanks=" + numberOfShootedBanks +
                '}';
    }

    public static void sayThatImStatic() {
        System.out.println("static!");
    }

    public Gangster(String name, int numberOfShootedBanks) {
        this.name = name;
        this.numberOfShootedBanks = numberOfShootedBanks;
    }

    public Gangster() {
        this.name = "undefined person";
        this.numberOfShootedBanks = 0;
    }

    public Gangster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfShootedBanks() {
        return numberOfShootedBanks;
    }

    public void setNumberOfShootedBanks(int numberOfShootedBanks) {
        this.numberOfShootedBanks = numberOfShootedBanks;
    }
}
