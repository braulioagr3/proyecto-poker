public class ManoDePoquer
{
    private Carta[] mano;
    private PaqueteDeCartas Pack;
    private int det;
    public ManoDePoquer()
    {   
        mano = new Carta[5];
        Pack = new PaqueteDeCartas();
        Pack.barajar();
        for(int i = 0; i<5;i++)
        {
            this.mano[i] = Pack.repartirCarta();
        }
    }
    public boolean unPar()
    {
        for(int i = 0; i<5;i++)
        {
            for(int j = 1; j<5; j++)
            {
                if(mano[i].dimeCara() == mano[j].dimeCara())
                {
                    det++;
                }
            }
            if(det>2)
            {
                det = 0;
            }
        }
        if (det == 2)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public boolean unaTercia()
    {
        for(int i = 0; i<5;i++)
        {
            for(int j = 1; j<5; j++)
            {
                if(mano[i].dimeCara() == mano[j].dimeCara())
                {
                    det++;
                }
            }
            if(det>3)
            {
                det = 0;
            }
        }
        if (det == 3)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public boolean unPoker()
    {
        for(int i = 0; i<5;i++)
        {
            for(int j = 1; j<5; j++)
            {
                if(mano[i].dimeCara() == mano[j].dimeCara())
                {
                    det++;
                }
            }
        }
        if (det == 4)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public int posibilidades()
    {
        boolean J;
        J=this.unPar();
        if(J == true)
        {
            det+=2;
        }
        J=this.unaTercia();
        if(J == true)
        {
            det+=3;
        }
        J=this.unPoker();
        if(J == true)
        {
            det+=4;
        }
        return det;
    }
    public void conmutaJugadas()
    {
        det=this.posibilidades();
        switch(det){
            case 2:
            System.out.println("Tienes un Par");
            break;
            case 3:
            System.out.println("Tienes una Tercia");
            break;
            case 4:
            System.out.println("Tienes un Poker");
            break;
            case 5:
            System.out.println("Tienes un Full");
            break;
            default:
            System.out.println("Carta alta");
            break;
        }
    }
}