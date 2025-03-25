package app;

public class Coche extends Vehiculo {
    public Coche(String matricula, double consumo) {
        super(matricula, consumo);
    }

    @Override
    public String getTipo() {
        return "Coche";
    }

    @Override
    public String toString() {
        return "Coche | Matricula: " + matricula + ", Consumo: " + consumo;
    }
    
    @Override
    public double getPrecio() {
        return (20548/3.78541);
    }
}