package app;
import IU.*;
public class Main {
    public static void main(String[] args) {
        FlotaVehiculos flota = new FlotaVehiculos();
        flota.agregarVehiculo(new Coche("ABC123", 45));
        flota.agregarVehiculo(new Camion("DEF456", 123));
        
        principal pantalla = new principal(flota);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}