package ACMR_40;

public class Calculator_40 {
    private static Calculator_40 instance;
    private Calculator_40(){}

    public static Calculator_40 getInstance(){
        if(instance == null){
            instance = new Calculator_40();
        }
        return instance;
    }

    public int computation(int number){
        int defaultValue= 2;
        for(int i=1; i<number; i++  ){
            defaultValue *= 2;
        }
        return defaultValue;
    }
}
