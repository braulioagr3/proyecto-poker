import java.util.Random;
public class PaqueteDeCartas
{
   private Carta[] paquete; // arreglo de objetos Carta
   private int cartaActual; // subindice de la siguiente Carta a repartir

   public PaqueteDeCartas()
   {
      String[] caras = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", 
         "Siete", "Ocho", "Nueve", "Diez", "Joto", "Quina", "Rey" };
      String[] palos = { "Corazones", "Diamantes", "Treboles", "Espadas" };

      paquete = new Carta[ 52 ]; // crea arreglo de objetos Carta
      cartaActual = 0; // establece cartaActual para que la primera Carta repartida sea paquete[ 0 ]

      // llena el paquete con objetos Carta
      for ( int cuenta = 0; cuenta < paquete.length; cuenta++ ) 
         paquete[ cuenta ] = 
            new Carta( caras[ cuenta % 13 ], palos[ cuenta / 13 ] );
   }
   
   // reparte una Carta
   public Carta repartirCarta()
   {
      // determina si quedan Cartas por repartir
      if ( cartaActual < paquete.length )
         return paquete[ cartaActual++ ]; // devuelve la Carta actual en el arreglo
      else        
         return null; // devuelve null para indicar que se repartieron todas las Cartas
   } 
   //El primer reto, consiste en escribir un método llamado 'barajar()', el cuál barajea en orden aleatorio las cartas después de llamarlo.
   public void barajar()
   {
       Random aleatorio = new Random();
       int Aleatorio;
       int Bandera;
       String CartaN = "";
       Carta[] paqueteR;
       paqueteR = new Carta[ 52 ];
       for(int i = 0; i<paquete.length; i++)
       {
           Aleatorio = aleatorio.nextInt(paquete.length);
           if(paquete[Aleatorio] != null)
           {
               paqueteR[i]=paquete[Aleatorio];
               paquete[Aleatorio] = null;
           }
           else
           {
               i--;
           }
       }
       for(int i = 0; i<paquete.length; i++)
       {
           paquete[i] =paqueteR[i];
       }
   }
   public void muestraCartas()
   {
    Carta carta = this.repartirCarta();
    while (carta != null) {
        System.out.println(carta.dimeInfo());
        carta = this.repartirCarta();
    }
   }
}