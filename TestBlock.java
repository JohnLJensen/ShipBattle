public class TestBlock
{
   public static void main(String[] args)
   {
      Block MyBlock = new Block();
      MyBlock.setCoordinates(1,2,3);
      if (MyBlock.isThisYou(1,2,3)) {System.out.println("IT IS ME");} else {System.out.println("NOT ME");}
      if (MyBlock.isThisYou(3,2,1)) {System.out.println("IT IS ME");} else {System.out.println("NOT ME");}
      MyBlock.SetColor("RED");
      System.out.println("X: "+MyBlock.getX());
      System.out.println("Y: "+MyBlock.getY());
      System.out.println("Z: "+MyBlock.getZ());
      System.out.println("COLOR: "+MyBlock.getCollor());
      MyBlock.setSelect(true);
      if (MyBlock.isSelect()) {System.out.println("I AM SET ");} else {System.out.println("NOT SET");}
      MyBlock.setSelect(false);
      if (MyBlock.isSelect()) {System.out.println("I AM SET ");} else {System.out.println("NOT SET");}
//      MyBlock.placeCell(Cell c)
//      MyBlock.removeCell()
        MyBlock.checkShotBlock(3,2,1);
      if (MyBlock.isCellHit()) {System.out.println("CELL HIT");} else {System.out.println("CELL OK");}
        MyBlock.checkShotBlock(1,2,3);
     if (MyBlock.isCellHit()) {System.out.println("CELL HIT");} else {System.out.println("CELL OK");}
   }
}
