package primes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * TODO!!!
 *
 * сделать задачу на синглтон ! (https://acmp.ru/asp/do/index.asp?main=task&id_course=1&id_section=6&id_topic=116&id_problem=719)
 * 1. Почитать что такое static поля и методы (любой урок на ютубе)
 * https://metanit.com/java/tutorial/3.4.php
 * 2. Посмотреть ролик про Singleton и вспомнить нахуй он нужен
 * https://www.youtube.com/watch?v=30YuRmzpplY
 * 3. Generic (параметризованные классы, посмотреть на том же metanit.com
 * 4. Найти ООП-задачу на acmp.ru (любую, скинуть мне решение скринами)
 * 5. toString() - вывод целого объекта по всем(или нужным) полям в консоль (вызываете через Generate..)
 * 6. equals() & hashCode() - сравнивали объекты https://www.youtube.com/watch?v=ZcZQEqxmjOQ
 * 7. ArrayList<T> - Динамические массивы в Java (!!)
 * НАПОМНИТЬ! Разобраться в след раз с гитом
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int size = in.nextInt();

        ArrayList<Integer> localArray = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Введите число: ");
            Integer tempNumber = in.nextInt();
            localArray.add(tempNumber);
        }
        System.out.println();

        //вызываем синглтон через статический метод getInstance()
        PrimeNumberService singletonService = PrimeNumberService.getInstance();
        int sumOfPrimeNumbers = singletonService.getSumOfPrimeNumbers(localArray);

        System.out.println("Сумма простых чисел: " + sumOfPrimeNumbers);
        if (singletonService.isPrime(sumOfPrimeNumbers)) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
    }


}

