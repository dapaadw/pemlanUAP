package Semester_2.Praktikum.UAP.bases;

import Semester_2.Praktikum.UAP.interfaces.MassConverter;
import Semester_2.Praktikum.UAP.interfaces.ShippingCostCalculator;

public abstract class Shape implements ShippingCostCalculator, MassConverter {
    private String name;

    public Shape() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printInfo();
}
