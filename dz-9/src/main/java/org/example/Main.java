package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Man man1 = new Man("Yurii","Kantemir",30);
        Woman woman1 = new Woman("Yu","YUoo",30);
        man1.registerPartnership(woman1);
        woman1.deregisterPartnership(true);
        System.out.println(woman1.lastName);
        System.out.println(man1.isRetired());


    }
}