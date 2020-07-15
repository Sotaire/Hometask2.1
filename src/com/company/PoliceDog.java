package com.company;

public final class PoliceDog extends Dog {

    private int rang;
    private String part;

    public PoliceDog (String name, String breed,String[] commands,Colors color, Shelter shelter,int rang,String part) {
        super(name,breed,commands,color,shelter);
        this.rang = rang;
        this.part = part;
    }

    public int getRang() {
        return rang;
    }

    public String getPart() {
        return part;
    }

    @Override
    public void makeVoice(String voice, int num) {
        super.makeVoice(voice, num);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" + "rang: " + rang + "\n" + "part: " + part;
    }

    public void Copyright (PoliceDog object) {
        this.part = object.part;
        this.rang = object.rang;
    }
}
