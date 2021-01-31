package primes;

import java.util.ArrayList;

public class PrimeNumberService {
    private static PrimeNumberService instance;

    private PrimeNumberService() {
    }

    public static PrimeNumberService getInstance() {
        if (instance == null) {
            instance = new PrimeNumberService();
        }
        return instance;
    }

    public int getSumOfPrimeNumbers(ArrayList<Integer> arrayFromMainClass) {
        int sumOfPrimeNumbers = 0;
        for (int i = 0; i < arrayFromMainClass.size(); i++) {
            if (isPrime(arrayFromMainClass.get(i))) {
                sumOfPrimeNumbers += arrayFromMainClass.get(i);
            }
        }
        return sumOfPrimeNumbers;
    }

    public boolean isPrime(Integer integer) {
        int numberOfDivisions = 0;
        for (int i = 1; i <= integer; i++) {
            if (integer % i == 0) {
                numberOfDivisions ++;
            }
        }
        return (numberOfDivisions == 2);
    }
}
