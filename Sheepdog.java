package ru.hse.sem;

import java.util.Random;

public class Sheepdog implements Dog{
    private Dog nextDog = null;

    @Override
    public void setNext(Dog dog) {
        nextDog = dog;
    }

    @Override
    public void pet() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) {
            System.out.print("WOOF");
        } else if (nextDog != null) {
            nextDog.pet();
        }
    }
}
