package app;
public class Ruta {
    public double recorrido;
    public double costoP;
    public String ciudadO;
    public String ciudadD;

    public Ruta(double recorrido, double costoP, String ciudadO, String ciudadD) {
        this.recorrido = recorrido;
        this.costoP = costoP;
        this.ciudadO = ciudadO;
        this.ciudadD = ciudadD;
    }
    
    public Ruta getRuta() {
        return new Ruta(recorrido, costoP, ciudadO, ciudadD);
    }
}