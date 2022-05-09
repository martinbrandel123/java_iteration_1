import Case.Case;
import Game.Game;
import Hero.Guerrier;
import Menu.Menu;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] arg){
        Game playGame = new Game();
        playGame.startGame();
        playGame.restartGame();
        playGame.test();
        List<Case> test = new ArrayList<Case>();
        test.add("f");

    }
}

