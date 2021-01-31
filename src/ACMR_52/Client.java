package ACMR_52;

public class Client {
    public static void main(String[] args) {
        Ticket ticket_1 = new Ticket("385916");
        String number = ticket_1.getNumber();
        Calculator calculator = Calculator.getInstanceCal() ;
        calculator.calculateTheLuckyTicket(number);


    }
}
