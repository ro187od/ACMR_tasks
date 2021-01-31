package ACMR_52;


import java.util.Arrays;

public class Calculator {
    private static Calculator instanceCal;

    public static Calculator getInstanceCal(){
        if(instanceCal == null){
            instanceCal = new Calculator();
        }
        return instanceCal;
    }

    public void calculateTheLuckyTicket(String ticket) {
        char[] array  = splitTheArray(ticket);
        char[] Array1 = Arrays.copyOfRange(array, 0, array.length/2);
        char[] Array2 = Arrays.copyOfRange(array, array.length/2, array.length);
        int sum_1 = sum(Array1);
        int sum_2 = sum(Array2);
        if (sum_1==sum_2){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");

        }
    }

    private int sum(char[] array2) {
        int p = 0;
        for(int i = 0; i<array2.length; i++){
            p += array2[i];
        }
        return p;
    }

    private char[] splitTheArray(String ticket) {
        char[] array = ticket.toCharArray();
        return array;
    }
}
