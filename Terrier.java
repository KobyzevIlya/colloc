package ru.hse.sem;

import java.util.Random;

public class Terrier implements Dog {
    private Dog nextDog;

    @Override
    public void setNext(Dog dog) {
        nextDog = dog;
    }

    @Override
    public void pet() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) {
            System.out.print("GAV");
        } else if (nextDog != null) {
            nextDog.pet();
        }
    }
}
