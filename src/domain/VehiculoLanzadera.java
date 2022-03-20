package domain;

public class VehiculoLanzadera extends NaveEspacial{

    private int capacidadTransporte;
    
    public VehiculoLanzadera(String nombre, int peso, int empuje, int altura, double potencia, int velocidad, String tipoCombustible, String objetivo, int capacidadTransporte) {
        super(nombre, peso, empuje, altura, potencia, velocidad, tipoCombustible, objetivo);
        this.capacidadTransporte = capacidadTransporte;
    }
    
    @Override
    public void despegar(){
        this.velocidad *= 45;
    }
    
    @Override
    public void objetivo(){
        System.out.println("Objetivo Vehículo Lanzadera: " + this.objetivo);
    }

    public int getCapacidadTransporte() {
        return this.capacidadTransporte;
    }

    public void setCapacidadTransporte(int capacidadTransporte) {
        this.capacidadTransporte = capacidadTransporte;
    }
        
}
