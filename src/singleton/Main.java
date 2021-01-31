package singleton;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayFromConsole = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int size = in.nextInt();


        for (int i = 0; i < size; i++) {
            System.out.println("Введи имя друга: ");
            String name = in.next();
            arrayFromConsole.add(name);
        }

        RepoSingleton repoSingleton = RepoSingleton.getInstance(arrayFromConsole);

        repoSingleton.add("Usif");

        System.out.println(repoSingleton.getByNumber(
                repoSingleton.getSize() - 1));


        anotherDeveloperDoWork();
    }

    private static void anotherDeveloperDoWork() {
        RepoSingleton singleton = RepoSingleton.getInstance();

        System.out.println(singleton.getByNumber(singleton.getSize() - 1));
    }
}
