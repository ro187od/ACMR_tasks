package ACMR_40;

import java.util.Scanner;

public class DataInput {
    public DataInput(){
    }

    public int inputNumberFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите степень в которую нужно возвести число 2: ");
        int numberFromUser = in.nextInt();
        return numberFromUser;
    }

}
