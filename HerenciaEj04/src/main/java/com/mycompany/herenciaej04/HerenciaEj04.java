/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.herenciaej04;

import Entidad.CalculosFormas;
import static Entidad.CalculosFormas.PI;
import Entidad.Circulo;
import java.util.Scanner;

/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.  
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.  
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class HerenciaEj04 {

    public static void main(String[] args) {
        int radio = 0;

        //Calculos con el circulo
        Circulo c = new Circulo();
        System.out.println("Area = "+c.area());
//        c.perimetro();
        //Calculos con del rectangulo
        Rectangulo r = new Rectangulo();
        System.out.println("Area = "+r.area());
//        r.perimetro();
    }

    public static class Circulo implements CalculosFormas {

        Scanner lr = new Scanner(System.in);

        @Override
        public double area() {
            System.out.println("Ingrese el radio del circulo  ");
            int radio = lr.nextInt();
            double area = PI * radio * radio;
            return area;

        }

        @Override
        public void perimetro() {
            
            double perimetro = 2 * PI * radio;
            System.out.println("Perimetro = " + perimetro);
        }
    }

    public static class Rectangulo implements CalculosFormas {

        Scanner lr = new Scanner(System.in);

        @Override
        public double area() {
            System.out.println("Ingrese la base del rectangulo  ");
            int base = lr.nextInt();
            System.out.println("Ingrese la altura del rectangulo  ");
            int altura = lr.nextInt();
            double area = base * altura;
            return area;
        }

        @Override
        public void perimetro() {
            double perimetro = base * 2 + altura * 2;
        }

    }
}
