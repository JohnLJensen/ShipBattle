public class BeerSong {
   public static void main (String[] args) {
      int beerNumber = 99;
      String word = "bottles";
      while (beerNumber > 0) {
         if ( beerNumber == 1) {
            word = "bottle";
         }

         System.out.println(beerNumber + " " + word + " of beer on the wall" );
         beerNumber--;
      }
   }
}
