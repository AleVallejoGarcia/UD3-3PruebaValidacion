package net.vehiculos.camion;

import net.vehiculos.VehiculoEstandar;

public class Camion extends VehiculoEstandar {

    protected int capacidadDeCarga;

    public Camion(String marca, int peso, int potencia, int numeroDePuertas, int capacidadDeCarga) {
        super(marca, peso, potencia, numeroDePuertas);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public float acelerar() {
        return this.velocidad = this.velocidad + 5;
    }

    @Override
    public String toString() {
        String msg = ("* Tipo de vehículo: Camión" + "\n");
        msg += ("* Marca: " + this.marca  + "\n");
        msg += ("* Peso: "+ this.peso + "\n");
        msg += ("* Potencia: " + this.potencia + "\n");
        msg += ("* Número de puertas: " + this.numeroDePuertas + "\n");
        msg += ("* Capacidad de carga: " + this.capacidadDeCarga + "\n");
        msg += ("* Velocidad actual: " + this.velocidad + "Km/h" + "\n");
        return msg;
    }
}
