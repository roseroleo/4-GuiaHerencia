/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author roser
 */
public class Circulo implements CalculosFormas {

    protected int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Scanner getLr() {
        return lr;
    }

    public void setLr(Scanner lr) {
        this.lr = lr;
    }

    Scanner lr = new Scanner(System.in);

    @Override
    public double area() {
        System.out.println("Ingrese el radio del circulo  ");
        int radio = lr.nextInt();
        this.radio = radio;
        double area = PI * radio * radio;
        return area;
    }

    @Override
    public void perimetro() {
        double perimetro = 2 * PI * getRadio();
        System.out.println("Perimetro = " + perimetro);
    }
}
