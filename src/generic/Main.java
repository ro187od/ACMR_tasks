package generic;

import ACMP_33.Gangster;
import ToString.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> dynamicArray = new ArrayList();
        dynamicArray.add("egor");
        dynamicArray.add("pasha");
        dynamicArray.add("misha");

        ArrayList<Integer> dynamicArrayOfInteger = new ArrayList<>();
        dynamicArrayOfInteger.add(123);
        dynamicArrayOfInteger.add(123);




        BankAccount<Double> doubleBankAccount = new BankAccount<>();
        doubleBankAccount.setVariable(10.0);
        System.out.println(doubleBankAccount.getVariable());


        BankAccount<Gangster> gangsterBankAccount = new BankAccount<>();
        Gangster vasya = new Gangster("Vasya");
        gangsterBankAccount.setVariable(vasya);
        System.out.println(gangsterBankAccount.getVariable());


        Person person = new Person("Egor", "Barkovsky", "123", 18);
        System.out.println(person);
    }
}
