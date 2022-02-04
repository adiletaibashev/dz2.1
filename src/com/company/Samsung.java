package com.company;

public final class Samsung extends Fon{
    private String samsungName;
    private int fonMach;
    private Color color;



    public Samsung(String fonCorpus, String fonprossor,
                   int fonCamera, int fonOperMemori,
                   String fonName, int fonYear,
                   String samsungName, int fonMach,Color color) {
        super(fonCorpus, fonprossor, fonCamera, fonOperMemori, fonName, fonYear);
        this.samsungName = samsungName;
        this.fonMach = fonMach;
        this.color = color;


    }


    public String getSamsungName() {
        return samsungName;
    }
    public int getFonMach() {return fonMach;}


    @Override
    public void fonMusic(String music){
        System.out.println(music + "тарара");
    }



    @Override
    public String getInfo(){
        return super.getInfo() + "" + samsungName +
                "\nобьем батареи: " + fonMach +
                "\nцвет: " + color ;


    }

}
