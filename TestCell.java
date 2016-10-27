public class TestCell {
   public static void main(String[] args)
   {
      Cell myCell = new Cell();
      myCell.setFake(true);
      if (myCell.isFake()) { System.out.println("IT IS FAKE"); } else {System.out.println("IT IS REAL");}
      myCell.setHit(true);
      if (myCell.isHit()) { System.out.println("I AM HIT "); } else {System.out.println("I AM OK");}
      myCell.setFake(false);
      if (myCell.isFake()) { System.out.println("IT IS FAKE"); } else {System.out.println("IT IS REAL");}
      myCell.setHit(false);
      if (myCell.isHit()) { System.out.println("I AM HIT "); } else {System.out.println("I AM OK");}
   }

}
