package com.company;

import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public  Dog (){}

    public Dog (String name, String breed,String[] commands,Colors color, Shelter shelter) {
        super(shelter,color);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(String name, String breed,Colors color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        new Pet(shelter,color);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void makeVoice (String voice,int num){
        for (int i = 0; i < num ; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice (int num,String voice){
        for (int i = 0; i < num ; i++) {
            System.out.println(voice);
        }
    }

    public final void makeVoice (String voice){
        System.out.println(voice);
    }

    @Override
    public String getInfo(){
        // for (int i = 0; i <commands.length ; i++) {

        // }
        return "name: " + name + "\n" + "breed: " + breed + "\n" + "commands: " + Arrays.toString(commands) + "\n" + super.getInfo();
    }
}
