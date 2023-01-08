import java.util.Arrays;

public class TestOfScore {
    public static void main(String[] args) {
        GameEntries r=new GameEntries("A",100);
        GameEntries r1=new GameEntries("B",106);
        GameEntries r2=new GameEntries("C",104);
        GameEntries r3=new GameEntries("D",103);
        Scoreboard board=new Scoreboard(3);
        board.add(r1);
        board.add(r2);
        board.add(r3);
        System.out.println(Arrays.toString(board.getBoard()));
        System.out.println(board.remove(1)+"removed successfully");
        System.out.println(Arrays.toString(board.getBoard()));
    }
}
