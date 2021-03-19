
package rps_game;
import java.util.Random;
public class RPS_Player {
    public String name;
    public Random rnd = new Random();
    public int wins = 0;
    public boolean win;
    
    public RPS_Player(String n)
    {
        name = n;
    }
    public RPS_Player()
    {
        
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setWins()
    {
        wins++;
    }
    public void play(int move)
    {
      int moveCPU = rnd.nextInt(2);
      if(move == 0)
      {
          if(moveCPU == 1)
          {
              System.out.println(name+" chose Rock and the Computer chose Paper");
              System.out.println("Computer wins.");
          }
          else if(moveCPU == 2)
          {
              System.out.println(name+" chose Rock and the Computer chose Scissors");
              System.out.println(name+" wins.");
              wins++;
          }
          else
          {
              System.out.println(name+" chose Rock and the Computer chose Rock");
              System.out.println("Tie!");
          }
      }
      else if(move == 1)
      {
          if(moveCPU == 1)
          {
              System.out.println(name+" chose Paper and the Computer chose Paper");
              System.out.println("Tie!");
          }
          else if(moveCPU == 2)
          {
              System.out.println(name+" chose Paper and the Computer chose Scissors");
              System.out.println("Computer wins.");
          }
          else
          {
              System.out.println(name+" chose Paper and the Computer chose Rock");
              System.out.println(name+" wins.");
              wins++;
          }
      }
      else
      {
          if(moveCPU == 1)
          {
              System.out.println(name+" chose Scissors and the Computer chose Paper");                    
              System.out.println(name+" wins.");
              wins++;
          }
          else if(moveCPU == 2)
          {
              System.out.println(name+" chose Scissors and the Computer chose Scissors");
              System.out.println("Tie!");
          }
          else
          {
              System.out.println(name+" chose Scissors and the Computer chose Rock");
              System.out.println("Computer wins.");
          }
      }
    }
    public int getWins()
    {
        return wins;
    }
}
