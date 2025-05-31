package Semester_2.Praktikum.UAP.mains;

import java.util.Scanner;
import Semester_2.Praktikum.UAP.models.*;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

           System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("DAFFA DWIKA ANARGYA");
        System.out.println("245150700111035");
        System.out.println("=============================================");
        // Donat dengan lubang (Torus)
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius : ");
        double majorRadius = sc.nextDouble();
        System.out.print("Isikan radius : ");
        double minorRadius = sc.nextDouble();
        System.out.println("=============================================");
        Torus donatDenganLubang = new Torus(majorRadius, minorRadius);
        donatDenganLubang.printInfo();
        System.out.println("=============================================");

        // Donat tanpa lubang (Sphere)
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius : ");
        double radius = sc.nextDouble();
        System.out.println("=============================================");
        Sphere donatTanpaLubang = new Sphere(radius);
        donatTanpaLubang.printInfo();
        System.out.println("=============================================");
        sc.close();
    }
}
