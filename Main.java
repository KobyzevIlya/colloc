package ru.hse.sem;

//гладим собак. Собака либо даёт нам себя погладить, либо указывает, какую собаку погладить следующей

public class Main {
    public static void main(String[] args) {
        Dog dog = new Sheepdog();
        dog.setNext(new Terrier());
        dog.pet();
    }
}