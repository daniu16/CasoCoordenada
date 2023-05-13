package ejecutable;

import modelo.Coordenada;

public class Test{
    public static void main(String[] args) 
    {

        Coordenada c1 = new Coordenada(0, 0);

        Coordenada c2 = new Coordenada(12, 3.3);

        System.out.println("la primera posicion es");
        System.out.println(c1.getPosx()+c1.getPosy());
        System.out.println(c1);

        System.out.println("");

        System.out.println("la primera posicion es");
        System.out.println(c2.getPosx()+c2.getPosy());
        System.out.println(c2);

        System.out.println("");

        if(c1.equals(c2))
        {
            System.out.println("las dos coordenadas son iguales");
        }else
        {
            System.out.println("Las dos coordenadas no son iguales");
        }

        
    
    }
}
