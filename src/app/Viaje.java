package app;
import java.time.LocalDate;
public class Viaje {
    public Vehiculo vehiculo;
    public Ruta ruta;
    public LocalDate fecha;
    
    public Viaje(Vehiculo vehiculo, Ruta ruta, LocalDate fecha) {
        this.vehiculo = vehiculo;
        this.ruta = ruta;
        this.fecha = fecha;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "vehiculo=" + vehiculo +
                ", ruta=" + ruta +
                ", fecha=" + fecha +
                '}';
    }
}