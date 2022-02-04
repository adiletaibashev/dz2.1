package com.company;

public class Fon extends  Gadzhet{
    private String fonName;
    private int fonYear;


    public Fon(String fonCorpus, String fonprossor, int fonCamera,
               int fonOperMemori, String fonName, int fonYear) {
        super(fonCorpus, fonprossor, fonCamera, fonOperMemori);
        this.fonName = fonName;
        this.fonYear = fonYear;

    }

    public String getFonName() {
        return fonName;
    }
    public int getFonYear() {
        return fonYear;
    }


    final void fonMusic(){
        System.out.println("лалалай");
    }
    public void fonMusic(String music){
        System.out.println(music);
    }



    @Override
    public String getInfo(){
        return super.getInfo() + "\nназвание модели: " + fonName +
                "\nгод модел: " + fonYear;
    }
}
