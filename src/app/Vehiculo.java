package app;

public abstract class Vehiculo {
    public String matricula;
    public double consumo;
    public double recorrido;
    public double costoP;
    public String ciudadO;
    public String ciudadD;
    public Ruta ruta;
    
    public Vehiculo (String matricula, double consumo) {
        this.matricula = matricula;
        this.consumo = consumo;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    public abstract String getTipo();
    
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    
    public Ruta getRuta() {
        return ruta;
    }
}