package test;

import domain.NaveEspacial;
import domain.NaveNoTripulada;
import domain.VehiculoLanzadera;

public class TestNaves {
    public static void main(String[] args) {
        NaveEspacial miNave1 = new NaveNoTripulada("VOSTOK", 1300, 2800, 256, 48409.54, 525, "Químico", "Desplazamiento sin energía de forma inercial", 5, 4);
        miNave1.objetivo();
        miNave1.despegar(); 
        System.out.println("La velocidad actual de la nave es: " + miNave1.getVelocidad() + " KM/H");
        miNave1.detener();
        System.out.println("La velocidad actual de la nave es: " + miNave1.getVelocidad() + " KM/H");
        
        System.out.println("");
        
        NaveEspacial miNave2 = new VehiculoLanzadera("SATURNO V", 1800, 3500, 280, 54938.43, 480, "Óxido Nítrico", "Transporte de Carga", 800);
        miNave2.objetivo();
        miNave2.despegar(); 
        System.out.println("La velocidad actual de la nave es: " + miNave2.getVelocidad() + " KM/H");
        miNave2.detener();
        System.out.println("La velocidad actual de la nave es: " + miNave2.getVelocidad() + " KM/H");
        
        System.out.println("");
        
        NaveEspacial miNave3 = new NaveNoTripulada("ATV", 1700, 3100, 315, 45789.43, 500, "Monometilhidracina", "Estudiar el Sol", 3, 137);
        miNave3.objetivo();
        miNave3.despegar(); 
        System.out.println("La velocidad actual de la nave es: " + miNave3.getVelocidad() + " KM/H");
        miNave3.detener();
        System.out.println("La velocidad actual de la nave es: " + miNave3.getVelocidad() + " KM/H");
    }
}
