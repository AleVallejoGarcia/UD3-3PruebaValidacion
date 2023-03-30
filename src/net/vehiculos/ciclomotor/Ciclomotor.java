package net.vehiculos.ciclomotor;

import net.vehiculos.VehiculoEstandar;

public class Ciclomotor extends VehiculoEstandar {

    protected boolean puedeIrPorAutopista;


    public Ciclomotor(String marca, int peso, int potencia, int numeroDePuertas, boolean puedeIrPorAutopista) {
        super(marca, peso, potencia, numeroDePuertas);
        this.puedeIrPorAutopista = puedeIrPorAutopista;
    }

    @Override
    public float acelerar() {
        return this.velocidad = this.velocidad + 7;
    }

    @Override
    public String toString() {
        String msg = ("* Tipo de vehículo: Ciclomotor" + "\n");
        msg += ("* Marca: " + this.marca  + "\n");
        msg += ("* Peso: "+ this.peso + "\n");
        msg += ("* Potencia: " + this.potencia + "\n");
        msg += ("* Número de puertas: " + this.numeroDePuertas + "\n");
        msg += ("* Puede ir por autopista: ");
        if (puedeIrPorAutopista == true) {
            msg += ("Sí" + "\n");
        } else msg += ("No" + "\n");
        msg += ("* Velocidad actual: " + this.velocidad + "Km/h" + "\n");
        return msg;
    }
}
