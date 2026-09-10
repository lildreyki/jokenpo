package application;

import entities.JoKenPo;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Program {

    void main() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        JoKenPo joKenPo = new JoKenPo();

        joKenPo.showHome();
        do {
            joKenPo.showOptions();
            joKenPo.setPc(random.nextInt(joKenPo.getOptions().length));
            try {
                joKenPo.setPlayer(scanner.nextInt());
            } catch (InputMismatchException e) {
                scanner.next();
                IO.println("*** INVALID OPTION");
            }
            joKenPo.showWin();
            joKenPo.nextGameQuestion();
            try {
                joKenPo.setNextGame(scanner.nextBoolean());
            } catch (InputMismatchException e) {
                joKenPo.setNextGame(false);
            }
        } while (joKenPo.getNextGame() == true);
        joKenPo.showHome();
        scanner.close();
    }
}