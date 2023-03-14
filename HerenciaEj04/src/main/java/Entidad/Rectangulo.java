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
public class Rectangulo implements CalculosFormas {

    public int base;
    private int altura;
    Scanner lr = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Scanner getLr() {
        return lr;
    }

    public void setLr(Scanner lr) {
        this.lr = lr;
    }

    @Override
    public double area() {
        System.out.println("Ingrese la base del rectangulo  ");
        int base = lr.nextInt();
        System.out.println("Ingrese la altura del rectangulo  ");
        int altura = lr.nextInt();
        this.base = base;
        this.altura = altura;
        double area = base * altura;
        return area;
    }

    @Override
    public void perimetro() {
        double perimetro = base * 2 + altura * 2;
        System.out.println("Perimetro = " + perimetro);
    }

}
