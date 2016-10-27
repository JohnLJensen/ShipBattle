public class Cell {

   private boolean Fake = false;
   private boolean Hit = false;

   public void setFake(boolean f)
   {
      Fake = f;
   }
   public boolean isFake()
   {
      return Fake;
   }
   public void setHit(boolean h)
   {
      Hit = h;
   }
   public boolean isHit()
   {
      return Hit;
   }

}
