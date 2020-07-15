package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Шарик","Лайка",new String[]{"лежать","сидеть"},Colors.GRAY,new Shelter("Приют","Ахунбаева"));
        System.out.println(dog.getInfo());
        dog.makeVoice(1,"гав");
        dog.makeVoice("гав гав",2);
        dog.makeVoice("гав гав гав");

        PoliceDog policeDog1 = new PoliceDog("Рекс","Овчарка",new String[]{"лежать","сидеть","след"},Colors.BLACK,new Shelter("Приют №1","Боконбаева"),4,"part №2");
        System.out.println(policeDog1.getInfo());
        policeDog1.makeVoice("*рычание*",2);

       PoliceDog policeDog2 = new PoliceDog("Алекс","Ротвейлер",new String[]{"кусай","сидеть","след"},Colors.BROWN,new Shelter("Приют №2","Московская"),2,"part №3");
        System.out.println(policeDog2.getInfo());
        policeDog2.makeVoice("*скулить*",3);

        policeDog2.Copyright(policeDog1);
        System.out.println(policeDog2.getInfo());

    }
}
