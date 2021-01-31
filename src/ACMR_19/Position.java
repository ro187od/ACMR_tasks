package ACMR_19;

public class Position {
    private char letterPos;
    private char numberPos;

    public Position(String positionFromUser){
        if (isPositionCorrect(positionFromUser) && isPositionOutOfDesk(positionFromUser)){
            setDefaultPosition(positionFromUser.charAt(0), positionFromUser.charAt(1));
        }
        else{
            System.out.println("Такой позиции не существует");
        }

    }

    private void setDefaultPosition(char a, char c) {
        this.letterPos = a;
        this.numberPos = c;
    }

    private boolean isPositionOutOfDesk(String positionFromUser) {
        return positionFromUser.charAt(0) <= 'H' && positionFromUser.charAt(1) <= 8;
    }

    //    проверка ошибки позиции
    private boolean isPositionCorrect(String positionFromUser) {
        if (positionFromUser.length() > 2) {
            System.out.println("Длина позиции слишком большая!");
            return false;
        }

        if (positionFromUser.charAt(0) > 90 || positionFromUser.charAt(0) < 65) {
            System.out.println("Буквенное значение позиции не корректно!");
            return false;
        }

        if (positionFromUser.charAt(1) > '8' || positionFromUser.charAt(1) < '1') {
            System.out.println("Цифровое значение позиции не корректно!");
            return false;
        }

        return true;
    }

    public void setNumberPos(char numberPos) {
        this.numberPos = numberPos;
    }

    public char getNumberPos() {
        return numberPos;
    }

    public void setLetterPos(char letterPos) {
        this.letterPos = letterPos;
    }

    public char getLetterPos() {
        return letterPos;
    }
}
