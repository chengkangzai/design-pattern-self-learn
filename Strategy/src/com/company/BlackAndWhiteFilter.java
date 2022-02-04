package com.company;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void filter(String fileName) {
        System.out.println("Black and white filter: " + fileName);
    }
}
