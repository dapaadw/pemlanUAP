package Semester_2.Praktikum.UAP.models;

import Semester_2.Praktikum.UAP.bases.Shape;
import Semester_2.Praktikum.UAP.interfaces.MassCalculable;
import Semester_2.Praktikum.UAP.interfaces.MassConverter;
import Semester_2.Praktikum.UAP.interfaces.PiRequired;
import Semester_2.Praktikum.UAP.interfaces.ShippingCostCalculator;
import Semester_2.Praktikum.UAP.interfaces.ThreeDimensional;

public class Torus extends Shape implements MassCalculable, PiRequired, ThreeDimensional, ShippingCostCalculator, MassConverter {
    private double majorRadius;
    private double minorRadius;

    public Torus() {}

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return 2 * (PI * PI) * majorRadius * (minorRadius * minorRadius);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * (PI * PI) * majorRadius * minorRadius;
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public void printInfo() {
        System.out.println("Volume: " + getVolume());
        System.out.println("Luas Permukaan: " + getSurfaceArea());
        System.out.println("Massa: " + getMass());
        System.out.println("Massa dalam kg: " + gramToKilogram());
        System.out.println("Biaya kirim: Rp" + calculateCost());
    }

    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        return Math.ceil(getMass() / DENOMINATOR) * PRICE_PER_KG;
    }
}
