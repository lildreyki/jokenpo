package application;

import entities.JoKenPo;

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
            joKenPo.setPlayer(scanner.nextInt());
            joKenPo.showWin();
            joKenPo.nextGameQuestion();
            joKenPo.setNextGame(scanner.nextBoolean());
        } while (joKenPo.getNextGame() == true);
        joKenPo.showHome();
        scanner.close();
    }
}