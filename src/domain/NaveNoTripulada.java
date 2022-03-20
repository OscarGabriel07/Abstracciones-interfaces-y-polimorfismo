package domain;

public class NaveNoTripulada extends NaveEspacial{
    
    public int celdasFotovoltaicas; 
    public int motoresCombustion;
    
    public NaveNoTripulada(String nombre, int peso, int empuje, int altura, double potencia, int velocidad, String tipoCombustible, String objetivo, int celdasFotovoltaicas, int motoresCombustion){
        super(nombre, peso, empuje, altura, potencia, velocidad, tipoCombustible, objetivo);
        this.celdasFotovoltaicas = celdasFotovoltaicas;
        this.motoresCombustion = motoresCombustion;
    }
    
    @Override
    public void despegar(){
        this.velocidad *= 60;
    }
    
    @Override
    public void objetivo(){
        System.out.println("Objetivo Nave NO Tripulada: " + this.objetivo);
    }

    public int getCeldasFotovoltaicas() {
        return this.celdasFotovoltaicas;
    }

    public void setCeldasFotovoltaicas(int celdasFotovoltaicas) {
        this.celdasFotovoltaicas = celdasFotovoltaicas;
    }

    public int getMotoresCombustion() {
        return this.motoresCombustion;
    }

    public void setMotoresCombustion(int motoresCombustion) {
        this.motoresCombustion = motoresCombustion;
    }
    
    
}
