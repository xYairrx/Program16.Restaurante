/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program17.restaurante;

/**
 *
 * @author Yair
 */
public class Restaurante {

    private int docenaHuevos;
    private double kilosChorizo;

    public Restaurante(int docenaHuevos, double kilosChorizo) {
        this.docenaHuevos = docenaHuevos;
        this.kilosChorizo = kilosChorizo;
    }

    public int getHuevos() {
        return this.docenaHuevos * 12;
    }

    public double getChorizo() {
        return this.kilosChorizo;
    }

    public void addHuevos(int numDocenas) {
        this.docenaHuevos = this.docenaHuevos + numDocenas;
    }

    public void addChorizo(double cantKilosChori) {
        this.kilosChorizo = this.kilosChorizo + cantKilosChori;
    }

    public void sirvePlato() {
        this.docenaHuevos = (this.docenaHuevos * 12) - 2;
        this.kilosChorizo = (this.kilosChorizo * 1000) - 200;
    }

    public int getNumPlatos(int n1, double n2) {

        int eleccion = 0;
        n1 = (this.docenaHuevos * 12) / 2;
        n2 = (int) (this.kilosChorizo / 0.2);

        if (n1 > n2) {
            eleccion = (int) n2;
        }
        if (n2 > n1) {
            eleccion = n1;
        }
        if (n2 == n1) {
            eleccion = n1;
        }
        return eleccion;
    }

}
