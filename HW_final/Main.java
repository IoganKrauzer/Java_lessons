package HW_final;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Laptop lap1 = new Laptop("Mac14Pro", 16, 512, "macOS", "grey");
        Laptop lap2 = new Laptop("Acer", 8, 512, "Windows", "black");
        Laptop lap3 = new Laptop("Xiomi", 8, 256, "Windows", "red");
        Laptop lap4 = new Laptop("MacAir", 16, 256, "macOS", "silver");
        Laptop lap5 = new Laptop("Msi", 32, 1024, "Windows", "pink");

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(lap1);
        laptops.add(lap2);
        laptops.add(lap3);
        laptops.add(lap4);
        laptops.add(lap5);
        System.out.println(laptops.toString().replace("[", "").replace("]", "").replace(",", ""));

        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "объем оперативной памяти");
        criteria.put(2, "объем жесткого диска");
        criteria.put(3, "оперативная система");
        criteria.put(4, "цвет");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите характеристики: \n1 - объем оперативной памяти");
        int critRam = sc.nextInt();
        System.out.println("2 - объем жесткого диска");
        int critHDD = sc.nextInt();
        System.out.println("\n=========R--E--S--U--L--T=========");

        for (Laptop lapt : laptops) {
            if (lapt.getRam() >= critRam && lapt.getHdd() >= critHDD) {
                System.out.println(lapt.toString());
            }
        }
        System.out.println("=========F--I--N=========");
        sc.close();
    }
}
