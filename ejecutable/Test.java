package ejecutable;

import modelo.Coordenada;

public class Test{
    public static void main(String[] args) 
    {

        Coordenada c1 = new Coordenada(0, 0);

        Coordenada c2 = new Coordenada(12, 3.3);

        System.out.println("La primera coordenada es:");
        System.out.println(c1);
        System.out.println("La segunda coordenada es:");
        System.out.println(c2);

        System.out.println("");

        if(c1.equals(c2))
        {
            System.out.println("Las dos coordenadas son iguales");
        }else
        {
            System.out.println("Las dos coordenadas no son iguales");
        }

        System.out.println("");

        c1.calcularDistancia(c2.getPosx(), c2.getPosy());
    
    }
}
