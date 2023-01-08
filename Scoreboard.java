import java.util.Arrays;

public class Scoreboard {
    private int numofenteries=0;
    private GameEntries board[];
    public Scoreboard(int capacity)
    {
        board= new GameEntries[capacity];

    }
public void add(GameEntries e){
        int nexscore=e.getScore();
        if (numofenteries<board.length||nexscore>board[numofenteries-1].getScore())
        {
            if (numofenteries<board.length)
                numofenteries++;
            int i=numofenteries-1;
            while (i>0&&nexscore>board[i-1].getScore()){
                board[i]=board[i-1];
                i--;
            }
            board[i]=e;
        }
}
public GameEntries remove(int index)
{
  if (index<0||index>numofenteries-1)
      throw  new ArrayIndexOutOfBoundsException("invaild entery of index "+index);
  GameEntries removed=board[index];
    for (int i = index; i <numofenteries ; i++)
        board[i]=board[i-1];
        board[numofenteries-1]=null;
        numofenteries--;
    return removed;
}

    public GameEntries[] getBoard() {
        return board;
    }
}
