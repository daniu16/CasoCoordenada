package modelo;

public class Coordenada {

    private double posx;
    private double posy;

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
        return "La coordenada es: " + posx + ", " + posy;
    }

    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordenada otra = (Coordenada) o;

        return Double.compare(otra.posx, posx) == 0 && Double.compare(otra.posy, posy) == 0;
    }

    public void calcularDistancia(double x, double y)
    {
        double distancia = Math.sqrt(Math.pow((this.posx - x), 2) + Math.pow((this.posy - y), 2));
        System.out.println("La distancia entre las coordenadas " + toString() + " y (" + x + "," + y + ") es " + distancia);
    }
}
