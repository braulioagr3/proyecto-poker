public class Carta 
{
   private String cara; // cara de la carta ("As", "Dos", ...)
   private String palo; // palo de la carta ("Corazones", "Diamantes", ...)

   public Carta( String caraCarta, String paloCarta )
   {
      cara = caraCarta;
      palo = paloCarta;
   } 
   public String dimeCara()
   {
       return cara;
   }
   public String dimeInfo() 
   { 
      return cara + " de " + palo;
   }
}