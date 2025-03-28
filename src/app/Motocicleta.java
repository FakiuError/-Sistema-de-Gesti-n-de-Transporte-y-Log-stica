package app;

public class Motocicleta extends Vehiculo {
    public Motocicleta(String matricula, double consumo) {
        super(matricula, consumo);
    }

    @Override
    public String getTipo() {
        return "Motocicleta";
    }

    @Override
    public String toString() {
        return "Motocicleta | Matricula: " + matricula + ", Consumo: " + consumo;
    }
    
    @Override
    public double getPrecio() {
        return (15777/3.78541);
    }
}