import javafx.beans.property.Property;
import jdk.nashorn.internal.parser.Token;

import javax.rmi.CORBA.Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.DigestException;
import java.util.Random;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class BoardGame {
    static final int money = 1000;

    public static void main(String[] args) {
BoardGame(printGameboard();)
        BoardGame
    }
    public static void printGameboard(String[][] gameBoard) {
        for (String[] row : gameBoard) {
            for (String S : row) {
                System.out.print(S);
            }
            System.out.println();
        }
    }
    int currentTurn = 0;
    int totalPlayer = 0;
    Player[] players;
    Square[] squares = new Square[18];
    String[] names = new String[] { "Trap", "Invest", "Party Hard", "Chance", "Steal", "Start",};

    public BoardGame(int totalPlayer) {
        players = new Player[totalPlayer];
        this.totalPlayer = totalPlayer;
        for(int i = 0;i < players.length;i++){
            players[i] = new Player(i, "Player " + (i + 1));
        }
        Random Dice = new Random();
        for(int i = 1;i < squares.length;i++){
            if(i == 1){
                squares[i] = new StartSquare[];
            }else if(i == 2){
                squares[i] = new TrapSquare[];
            }else if(i == 5){
                squares[i] = new InvestSquere[];
            }else if(i == 6){
                squares[i] = new PartyHardSquare[];
            }
        }
         class Die
        {

            private int numSides;
            private Random gen;
            public Die()
            {
                numSides = 6;
                gen = new Random();
            }
            public Die(int n)
            {
                numSides = n;
                gen = new Random();
            }
            public int getNumSides()
            {
                return numSides;
            }

            public void setNumSides(int n)
            {
                numSides = n;
            }
            public int nextRoll()
            {
                return gen.nextInt(numSides) + 1;
            }

            public String toString()
            {
                return "Number of Sides" + numSides;
            }
        }
    }

    public Square movePlayer(Player player, int face) {
        return movePlayer(player, face, true);
    }

    public Square movePlayer(Player player, int face, boolean count) {
        if(player.isBrokeOut()){ return squares[player.getSpace()]; }
        int newPosition = normalizePosition(player.getSpace() + face);
        player.setSpace(newPosition);
        Util.print(player, player.getPiece() + " goes to " + squares[player.getSpace()].getname());
        squares[newPosition].doAction(player, this);
        if(player.().isBrokeOut()){
            Util.print(player, player.getPiece() + " has been broke out!");
            player.setBrokeOut(true);
        }else{
            if(count){
                player.nextTurn();
            }
        }
        return squares[newPosition];
    }

    public boolean hasWinner() {
        int ingame = 0;
        for(Player player:players){
            if(!player.isBrokeOut()){
                ingame++;
            }
        }
        return ingame <= 1;
    }

    public Player getWinner() {
        if(!hasWinner()){ return null; }
        for(Player player:players){
            if(!player.isBrokeOut()){ return player; }
        }
        return null;
    }

    public Player getMaxMoneyPlayer() {
        Player maxplayer = null;
        for(Player player:players){
            if(maxplayer == null || maxplayer.setMoney();().getMoney() < player.setMoney();
                maxplayer = player;
            }
        }
        return maxplayer;
    }

    public int normalizePosition(int position) {
        return position % squares.length;
    }

    public Player getCurrentPlayer() {
        return players[currentTurn];
    }

    public Player[] getPlayers() {
        return players;
    }

    public void nextTurn() {
        if(++currentTurn >= players.length){
            currentTurn = 0;
        }
    }

    public Player getPlayer(int id) {
        return players[id];
    }

    public int getTotalSquare() {
        return squares.length;
    }
}
    abstract class Square
    {

        private String name;

        private int number;


        public Square(String name, int number)
        {
            this.name = name;
            this.number = number;
        }


        public String name()
        {
            return name;
        }


        public int number()
        {
            return number;
        }

        public abstract void landedOn(Player p);

    }
    public class Player{
        public static final int Obelisk      = 0;
        public static final int Asterix     = 1;
        private String name;
        private int whichPiece;
        private int space;
        private int money;
        public Player()
        {
            name       = new String("Unknown");
            whichPiece = 0;
            space      = 0;
            money      = 1000;
    }
        public Player getCurrentPlayer() {
            Player[] players;
            return players[currentTurn];
        }

        public Player[] getPlayers() {
            Player[] players;
            return players;
        }
        public void nextTurn() {
            if(++currentTurn >= players.length){
                currentTurn = 0;
            }

        }
        public void setMoney(int value)
        {

           this.money += value;
        }
        public int getSpace()
        {
            return space;
        }
        public void setSpace(int location)
        {
            space = location;
        }
        public void movePiece(int amt)
        {
            space += amt;
        }
        public int getPiece()
        {
            return whichPiece;
        }
        public void setPiece(int piece)
        {
            whichPiece = piece;
        }

      }



    class TrapSquare{
public void Traps(){


}

    }
    class StartSquare{


    }
    class PartyHardSquare{


    }
    class InvestSquere{
    {

    }


public static void MonopolyReader() throws FileNotFoundException
{
    File file1 = new File("C:\\Users\\Bro momento\\Desktop\\TrapFile.txt");
    Scanner scan = new Scanner(file1);
    while(scan.hasNextLine()) {
        System.out.println(scan.nextLine());
    }
    File file2 = new File("");
}


    }








