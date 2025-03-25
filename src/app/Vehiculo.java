package app;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Vehiculo {
    public String matricula;
    public double consumo;
    public Ruta ruta;
    public double precio;
    List<Viaje> historialViajes;
    
    public Vehiculo (String matricula, double consumo) {
        this.matricula = matricula;
        this.consumo = consumo;
        this.historialViajes = new ArrayList<>();
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
    
    public double getPrecio() {
        return precio;
    }
    
    public void registrarViaje(Ruta ruta, String fecha) {
        LocalDate fechaViaje = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        historialViajes.add(new Viaje(this, ruta, fechaViaje));
    }
    
    public List<Viaje> getHistorialViajes() {
        return historialViajes;
    }
}