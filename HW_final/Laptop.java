package HW_final;

import java.util.ArrayList;
import java.util.List;


public class Laptop {

    private String name;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Laptop(String name, int ram, int hdd, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public static List<String> propertiesForFilter() {
        List<String> list = new ArrayList<>();
        list.add("name");
        list.add("ram");
        list.add("hdd");
        list.add("os");
        list.add("color");
        return list;
    }

    @Override
    public String toString() {
        return "\nMark: " + name +
                "\nRam: " + ram +
                "\nHDD: " + hdd +
                "\nOS: " + os +
                "\nColor: " + color + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Laptop) {
            return this.name.equals(((Laptop) o).name) && this.ram == ((Laptop) o).ram
                    && this.hdd == ((Laptop) o).hdd && this.os.equals(((Laptop) o).os)
                    && this.color.equals(((Laptop) o).color);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHdd() {
        return this.hdd;
    }

    public String getOs() {
        return this.os;
    }

    public String getColor() {
        return this.color;
    }

}
