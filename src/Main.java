import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String GAME_MENU = "[1]Начать раунд\n[2]Выйти из игры";
    public static String MENU_SELECT_COMMENT = "Что бы начать или завершить игру введите цифру";
    public static String EXIT_MESSAGE = "Спасибо, что играли";
    ArrayList<String> allWord = new ArrayList<>();
    {
        allWord.add("Кошка");
        allWord.add("Собака");
    }
    public static void main(String[] args) {
        startMenu();
    }

    public static void startMenu() {
        System.out.println(GAME_MENU);
        switch(getUserAnswer()){
            case 1: startRound();
            break;
            case 2: exitGame();
            break;
            default: startMenu();
            break;
        }

    }

    public static int getUserAnswer() {
        System.out.println(MENU_SELECT_COMMENT);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void exitGame() {
        System.out.println(EXIT_MESSAGE);
    }

    public static void startRound() {
        selectWord();
        while(gameCondition()) {
            getLetter();
            checkLetter();
        }
    }

    public static boolean gameCondition() {
        return true;
    }

    public static void checkLetter() {
    }

    public static void getLetter() {
    }

    public static void selectWord() {
    }

}