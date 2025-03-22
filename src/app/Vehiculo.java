package app;

public abstract class Vehiculo {
    public String matricula;
    public double consumo;
    
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
}