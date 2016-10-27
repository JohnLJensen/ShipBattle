public class TestBoard
{
   public static void main(String[] args)
   {
   Board MyBoard = new Board();
   Block MyBlock = new Block();
   MyBoard.setBoardRange(2,2,2);
   MyBoard.buildBoard();
   MyBoard.showBoard();
   MyBlock = MyBoard.getThisBlock(2,2,2);
   
   System.out.println("");
   System.out.println("X: "+MyBlock.getX());
   System.out.println("Y: "+MyBlock.getY());
   System.out.println("Z: "+MyBlock.getZ());

  }
}
