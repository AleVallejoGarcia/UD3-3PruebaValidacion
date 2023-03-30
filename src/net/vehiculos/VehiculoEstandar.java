package net.vehiculos;

public class VehiculoEstandar {

    protected String marca;
    protected int peso;
    protected int potencia;
    protected int numeroDePuertas;
    protected float velocidad;

    public VehiculoEstandar(String marca, int peso, int potencia, int numeroDePuertas) {
        this.marca = marca;
        this.peso = peso;
        this.potencia = potencia;
        this.numeroDePuertas = numeroDePuertas;
        this.velocidad = 0;
    }

    public String getMarca() { return this.marca; }
    public int getPeso() { return this.peso; }
    public int getPotencia() { return this.potencia; }
    public int getNumeroDePuertas() { return this.numeroDePuertas; }
    public float getVelocidad() { return this.velocidad; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setPeso(int peso) { this.peso = peso; }
    public void setPotencia(int potencia) {this.potencia = potencia; }
    public void setNumeroDePuertas(int numeroDePuertas) { this.numeroDePuertas = numeroDePuertas; }
    public void setVelocidad(float velocidad) { this.velocidad = velocidad; }

    public float acelerar() {
        return this.velocidad = this.velocidad + 10;
    }
}


