public class Block
{
   public int BlockX;
   public int BlockY;
   public int BlockZ;
   public String Color = null;
   public int Id = -1;
   public Cell ACell = new Cell();
   public boolean Occupied = false;
   public boolean Selected  = false;
   
   public void setCoordinates(int x, int y, int z)
   {
      BlockX = x;
      BlockY = y;
      BlockZ = z; 
      ACell.setHit(false);

   }
   
   public boolean isThisYou(int x, int y, int z)
   {
      if ((BlockX == x ) &&  (BlockY == y) &&(BlockZ == z))
      {
         return true;
      }
      return false;
   }
   public void SetColor(String c)
   {
      Color = c;
   }

   public int getX()
   {
      return BlockX;
   }

   public int getY()
   {
      return BlockY;
   }

   public int getZ()
   {
      return BlockZ;
   }

   public String getCollor()
   {
      return Color;
   }
   public void setSelect(boolean s)
   {
      Selected = s;
   }
   public boolean isSelect()
   {
      return Selected;
   }
   public void placeCell(Cell c)
   {
      ACell = c;
   }
   public void removeCell()
   {
      ACell = new Cell();
   }
   public void checkShotBlock(int x, int y, int z)
   {
      if ((BlockX == x ) &&  (BlockY == y) &&(BlockZ == z))
      {
          //System.out.println("BlockX: "+BlockX+" X: "+x);
          //System.out.println("BlockY: "+BlockY+" Y "+y);
          //System.out.println("BlockZ: "+BlockZ+" Z: "+z);
          ACell.setHit(true);
      }
   }
   public boolean isCellHit()
   {
      return ACell.isHit();
   }
}
