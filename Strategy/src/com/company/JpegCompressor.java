package com.company;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String input) {
        System.out.println("Compressing " + input + " to JPEG");
    }
}
