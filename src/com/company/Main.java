package com.company;

public class Main {

    public static void main(String[] args) {
	Fon objectA  = new Fon("пластик","exynos 990",
            12,8,"самсунг",2019);
        System.out.println(objectA.getInfo());
        objectA.fonMusic("музыка");
        System.out.println("-----------------");
        Samsung objectb = new Samsung("стекло","exynos 2100", 108,12,
                "Samsung",2020,"S 21 ultra",5000,Color.BLACK);
        FonShowroom fon = new FonShowroom("mt", "чуй проспект");
        System.out.println(fon.info());
    }
}
