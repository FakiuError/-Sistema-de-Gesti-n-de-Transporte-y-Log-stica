package app;

import java.util.ArrayList;

public class FlotaVehiculos {
    
    public ArrayList<Vehiculo> vehiculos;
    public String tipo;
    public double consumo;
    public String matricula;
    
    public FlotaVehiculos() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                tipo = v.getTipo();
                consumo = v.getConsumo();
                this.matricula = v.getMatricula();
                System.out.println("Si existe");
                return v;
            }
        }
        System.out.println("No existe");
        return null;
    }
    
    public Vehiculo eliminarVehiculo(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                vehiculos.remove(v);
            }
        }
        return null;
    }

    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos en la flota.");
        } else {
            System.out.println("Lista de vehIculos:");
            for (Vehiculo v : vehiculos) {
                System.out.println(v.toString());
            }
        }
    }
    
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}