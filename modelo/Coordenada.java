package modelo;

import javax.crypto.SecretKeyFactorySpi;

public class Coordenada {

    //---------------
    // Atributos 
    //---------------
    private double posx;
    private double posy;

    //---------------
    // Metodos 
    //---------------

    //---------------
    // Constructor
    //---------------
    public Coordenada(double posx, double posy)
    { 
        this.posx = posx;
        this.posy = posy;

    }
    
    public double getPosx() {
        return posx;
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public double getPosy() {
        return posy;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }

    public String toString()
    {
        return "La cordenada es: "+posx+","+posy;
    }

    /*
     * //construir con parametros string dd/mm/aaaa
    public Fecha(String s)
    {
        //busquemos la primera ocurrencia de "/"
        int pos1 = s.indexOf("/");

        //busquemos la ultima ocurrencia de "/"
        int pos2 = s.lastIndexOf("/");

        //extraemos el dia 
        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);

        //extraemos el mes
        String sMes = s.substring(pos1 + 1, pos2);
        mes = Integer.parseInt(sMes);

        //extraemos el año
        String sAnio = s.substring(pos2 + 1);
        anio = Integer.parseInt(sAnio);
    }
     */

    public boolean equals(Object o)
    {
        Coordenada otra = (Coordenada)o;
        return (posx==otra.posx) && (posy==otra.posy);
    }
    
}
