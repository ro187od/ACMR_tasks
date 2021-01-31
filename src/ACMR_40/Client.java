package ACMR_40;

public class Client {
    public static void main(String[] args) {
        DataInput dataInput = new DataInput();
        Calculator_40 calculator_40 = Calculator_40.getInstance();
        int powerNumber = calculator_40.computation(	dataInput.inputNumberFromUser());
        OutputData outputData = OutputData.getInstance(powerNumber);
        System.out.println(outputData.toString());
    }
}
