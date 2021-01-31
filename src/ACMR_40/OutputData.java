package ACMR_40;

public class OutputData {
    private int number;
    private static OutputData instance;
    private OutputData(int number){
        this.number = number;
    }

    public static OutputData getInstance(int number) {
        if (instance == null){
            instance = new OutputData(number);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "OutputData{" +
                "number=" + number +
                '}';
    }
}
