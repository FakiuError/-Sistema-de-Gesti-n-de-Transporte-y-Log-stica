package app;

public class Camion extends Vehiculo {
    public Camion(String matricula, double consumo) {
        super(matricula, consumo);
    }

    @Override
    public String getTipo() {
        return "Camion";
    }

    @Override
    public String toString() {
        return "Camion | Matricula: " + matricula + ", Consumo: " + consumo;
    }
    
    @Override
    public double getPrecio() {
        return (10842/3.78541);
    }
}