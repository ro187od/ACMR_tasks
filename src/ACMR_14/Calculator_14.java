package ACMR_14;

public class Calculator_14 {
    private static Calculator_14 instance;
    private Calculator_14(){}

    public static Calculator_14 getInstance() {
        if(instance == null){
            instance = new Calculator_14();
        }
        return instance;
    }

    public void computation(int number_one, int number_two){
        boolean fa = true;
        int i = 1;
        while (fa){
            if(i % number_one == 0 && i % number_two == 0){
                break;
            }
            i++;
            System.out.println(i);
        }
    }
}
