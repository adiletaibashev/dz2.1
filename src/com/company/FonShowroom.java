package com.company;

public class FonShowroom {
    private String name;
    private String street;



    public FonShowroom(String name,String street) {
        this.name = name;
        this.street = street;

    }

    public String getStreet() {
        return street;
    }

    public String getName() {
        return name;
    }

    public String info(){
        return "\nназвание магазина: " + name +
                "\nназвание улицы: " + street;


    }

}
