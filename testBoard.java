import java.util.ArrayList;
public class testBoard {

   public static void main(String[] args)
   {
      Board myBoard = new Board();
      BoardBlock thisBlock = new BoardBlock();
      int somenum=3;
      myBoard.setBoardRange(3,3,1);
      myBoard.buildBoard();
      myBoard.showBoard();
      thisBlock = myBoard.getThisBlock(2,1,1);
      System.out.print("THIS X: "+thisBlock.getX());
      System.out.print("THIS Y: "+thisBlock.getY());
      System.out.println("THIS Z: "+thisBlock.getZ());
   }
}
