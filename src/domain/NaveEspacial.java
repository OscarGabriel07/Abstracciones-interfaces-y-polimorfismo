package domain;

public abstract class NaveEspacial {
    
    public String nombre;
    public int peso;
    public int empuje;
    public int altura;
    public double potencia;
    public int velocidad;
    public String tipoCombustible;
    public String objetivo;
    public boolean despegue;
    
    public NaveEspacial(String nombre, int peso, int empuje, int altura, double potencia, int velocidad, String tipoCombustible, String objetivo){
        this.nombre = nombre;
        this.peso = peso;
        this.empuje = empuje;
        this.altura = altura;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.tipoCombustible = tipoCombustible;
        this.objetivo = objetivo;
    }
    
    public abstract void despegar();
    
    public abstract void objetivo();
    
    public void detener(){
        this.velocidad = 0;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEmpuje() {
        return this.empuje;
    }

    public void setEmpuje(int empuje) {
        this.empuje = empuje;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPotencia() {
        return this.potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipoCombustible() {
        return this.tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getObjetivo() {
        return this.objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    
}
