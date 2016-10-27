import java.util.ArrayList;
public class Board
{
   public ArrayList<Block> myBoard = new ArrayList<Block>();
   private Block myBlock = new Block();
   private int xRange;
   private int yRange;
   private int zRange;
   public void setBoardRange(int x, int y, int z)
   {
      xRange = x;
      yRange = y;
      zRange = z;
   }
  
   public void buildBoard()
   {
      int tempX=0;
      int tempY=0;
      int tempZ=0;

      while(tempX < xRange)
      {
         tempY=0;
         while(tempY < yRange)
         {
            tempZ=0;
            while(tempZ < zRange)
            {
               myBlock = new Block();
               myBlock.setCoordinates(tempX,tempY,tempZ);
               myBoard.add(myBlock);
               tempZ++;
            }
            tempY++;
         }
         tempX++;
      }
   }

   public void showBoard()
   {
       for (Block someBlock : myBoard)
       {
          System.out.print("X: "+someBlock.getX());
          System.out.print("Y: "+someBlock.getY());
          System.out.println("Z: "+someBlock.getZ());
       }
   }

   public Block getThisBlock(int x, int y, int z)
   {
       Block otherBlock = new Block();
       for (Block someBlock : myBoard)
       {
          if (someBlock.isThisYou(x,y,z))
          {
               System.out.println("THIS IS THE BLOCK ");
               otherBlock = someBlock;
               return otherBlock ;
          }
       }
       return otherBlock ;
   }
}
