import Case.Items;
import Case.Weapon.Epees;
import Case.Weapon.Massues;
import Game.Game;
import Board.Board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Hero.Personnage;
import Hero.Guerrier;
import Hero.Magicien;

public class Main {
    public static void main(String[] arg){
//        Game playGame = new Game();
//         playGame.startGame();
//       playGame.restartGame();
        Personnage personnage = new Guerrier("michel", "pseudo");
        System.out.println(personnage);
        personnage.setItem(new Epees());
        personnage.setAttack(personnage.getItem().getItemAttack());
        System.out.println(personnage);
        personnage.setItem(new Massues());
        personnage.setAttack(personnage.getItem().getItemAttack());
        System.out.println(personnage);


    }
}

