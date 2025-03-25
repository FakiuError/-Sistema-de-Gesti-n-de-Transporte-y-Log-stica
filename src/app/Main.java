package app;
import IU.*;
public class Main {
    public static void main(String[] args) {
        FlotaVehiculos flota = new FlotaVehiculos();
        flota.agregarVehiculo(new Coche("ABC123", 0.07));
        flota.agregarVehiculo(new Camion("DEF456", 0.12));
        flota.agregarVehiculo(new Motocicleta("GHI789", 0.035));
        
        principal pantalla = new principal(flota);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}