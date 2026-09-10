package entities;

public class JoKenPo {

    private String[] options = new String[]{"Rock", "Paper", "Scissors"};
    private Integer pc;
    private Integer player;
    private Boolean nextGame;

    public JoKenPo(){}
    public JoKenPo(String[] options, Integer pc, Integer player, Boolean nextGame) {
        this.options = options;
        this.pc = pc;
        this.player = player;
        this.nextGame = nextGame;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public Integer getPc() {
        return pc;
    }

    public void setPc(Integer pc) {
        this.pc = pc;
    }

    public Integer getPlayer() {
        return player;
    }

    public void setPlayer(Integer player) {
        if (player < 0 || player >= options.length) {
            IO.println("*** INVALID OPTION");
        }
        this.player = player;
    }

    public Boolean getNextGame() {
        return nextGame;
    }

    public void setNextGame(Boolean nextGame) {
        this.nextGame = nextGame;
    }

    public void showHome() {
        IO.println("\n***************");
        IO.println("*** JOKENPO ***");
        IO.println("***************");
    }

    public void showOptions() {
        IO.println();
        int i = 0;
        for (String o : options) {
            IO.println("["+i+"] "+o);
            i++;
        }
        IO.print(">>> ENTER: ");
    }

    public void showWin() {
        try {
            IO.println("\n*** PLAYER: " + options[player]);
            IO.println("*** PC: " + options[pc]);
            win();
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (NullPointerException e) {
        }
    }

    private void win() {
        if (pc == 0 && player == 1) {
            IO.println("*** PLAYER WON");
        } else if (pc == 0 && player == 2) {
            IO.println("*** PC WON");
        } else if (pc == 1 && player == 0) {
            IO.println("*** PC WON");
        } else if (pc == 1 && player == 2) {
            IO.println("*** PLAYER WON");
        } else if (pc == 2 && player == 0) {
            IO.println("*** PLAYER WON");
        } else if (pc == 2 && player == 1) {
            IO.println("*** PC WON");
        } else {
            IO.println("*** DRAW");
        }
    }

    public void nextGameQuestion() {
        IO.print("\n>>> PLAY AGAIN? (true/false): ");
    }
}