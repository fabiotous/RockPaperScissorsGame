
package rps_game;
import java.util.Scanner;
public class RPS_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RPS_Player player = new RPS_Player("Zinquer");
        for(int i = 0; i<=9; i++)
        {
            System.out.println("Please input 0 for Rock, 1 for Paper, or 2 for Scissors: ");
            int playermove = input.nextInt();
            player.play(playermove);
            System.out.println(player.getName()+" has "+player.getWins()+" wins!");
        }
    }
}
