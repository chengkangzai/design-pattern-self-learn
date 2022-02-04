package com.company;

public class Main {

    public static void main(String[] args) {
        var storage = new ImageStorage();
        storage.store("s", new JpegCompressor(), new BlackAndWhiteFilter());
        storage.store("s", new PNGCompressor(), new BlackAndWhiteFilter());

        //What is the difference between Strategy and State?
        //Strategy  --> allows an algorithm to be swapped out
        //State     --> allows an object to change its behavior
    }
}
