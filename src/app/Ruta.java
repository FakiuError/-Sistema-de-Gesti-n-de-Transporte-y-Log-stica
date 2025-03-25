package app;
public class Ruta {
    public double recorrido;
    public double costoP;
    public String ciudadO;
    public String ciudadD;
    
    FlotaVehiculos flota = new FlotaVehiculos();

    public Ruta(double recorrido, double costoP, String ciudadO, String ciudadD) {
        this.recorrido = recorrido;
        this.costoP = costoP;
        this.ciudadO = ciudadO;
        this.ciudadD = ciudadD;
    }
    
    public Ruta getRuta() {
        return new Ruta(recorrido, costoP, ciudadO, ciudadD);
    }
    
    public double getCostoP() {
        return costoP;
    }
    
    public double getRecorrido() {
        return recorrido;
    }
    
    public String getCiudadO() {
        return ciudadO;
    }
    
    public String getCiudadD() {
        return ciudadD;
    }
    
    public double calcularCosto(Vehiculo vehiculo) {
        double consumo = vehiculo.getConsumo();  // 
        double precioLitro = vehiculo.getPrecio(); 
        return (consumo * recorrido * precioLitro) + costoP;
}
    
    @Override
    public String toString() {
        return "Ruta: " + ciudadO + " -> " + ciudadD + 
           ", Distancia: " + recorrido + " km, Peaje: $" + costoP;
    }
}