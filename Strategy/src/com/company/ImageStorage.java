package com.company;

public class ImageStorage {

    public void store(String fileName, Compressor compressor, Filter filter) {
        System.out.println("Storing image " + fileName);
        compressor.compress(fileName);
        filter.filter(fileName);
    }
}
