package app;

public class Camion extends Vehiculo {
    public Camion(String matricula, double consumo) {
        super(matricula, consumo);
    }

    public String getTipo() {
        return "Camion";
    }

    @Override
    public String toString() {
        return "Camion | Matricula: " + matricula + ", Consumo: " + consumo;
    }
}