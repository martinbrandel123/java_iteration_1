import Case.Case;
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
import java.sql.*;

public class Main {
    public static void main(String[] arg){
        Game playGame = new Game();
        playGame.startGame();
        playGame.restartGame();
        //Board board = new Board();
        //board.createGameBoard();
       //System.out.println(board.getBoard());
    }
}

