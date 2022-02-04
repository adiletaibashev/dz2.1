package com.company;

public class Gadzhet {
    private String fonCorpus;
    private String fonprossor;
    private int fonCamera;
    private int fonOperMemori;

    public Gadzhet(String fonCorpus, String fonprossor, int fonCamera, int fonOperMemori) {
        this.fonCorpus = fonCorpus;
        this.fonprossor = fonprossor;
        this.fonCamera = fonCamera;
        this.fonOperMemori = fonOperMemori;
    }

    public String getFonCorpus() {
        return fonCorpus;
    }
    public String getFonprossor() {
        return fonprossor;
    }
    public int getFonCamera() {
        return fonCamera;
    }
    public int getFonOperMemori() {
        return fonOperMemori;
    }




    public String getInfo(){
        return "\nкорпус: " + fonCorpus +
                "\nпроцессор: " + fonprossor +
                "\nкамера: " + fonCamera +
                "\nпамять: " + fonOperMemori;
    }


}
