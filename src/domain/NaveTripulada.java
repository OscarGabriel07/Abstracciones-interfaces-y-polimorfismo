package domain;

public class NaveTripulada extends NaveEspacial{
    
    public int capacidadPersonas;
    public int distanciaSuperficie;
    
    public NaveTripulada(String nombre, int peso, int empuje, int altura, double potencia, int velocidad, String tipoCombustible, String objetivo, int capacidadPersonas, int distanciaSuperficie){
        super(nombre, peso, empuje, altura, potencia, velocidad, tipoCombustible, objetivo);
        this.capacidadPersonas = capacidadPersonas;
        this.distanciaSuperficie = distanciaSuperficie;
    }
    
    @Override
    public void despegar(){
        this.velocidad *= 30;
    }
    
    @Override
    public void objetivo(){
        System.out.println("Objetivo Nave Tripulada: " + this.objetivo); 
    }

    public int getCapacidadPersonas() {
        return this.capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public int getDistanciaSuperficie() {
        return this.distanciaSuperficie;
    }

    public void setDistanciaSuperficie(int distanciaSuperficie) {
        this.distanciaSuperficie = distanciaSuperficie;
    }
    
    
}
