package ACMR_19;

public class Client {
    public static void main(String[] args) {
        Position sourcePosition = new Position("B2");
        Knight knight = new Knight(sourcePosition);
        System.out.println(knight.position.getLetterPos());
        System.out.println(knight.position.getNumberPos());
    }
}
