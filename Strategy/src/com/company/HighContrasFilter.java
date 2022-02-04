package com.company;

public class HighContrasFilter implements Filter {

    @Override
    public void filter(String fileName) {
        System.out.println("High Contras filter: " + fileName);
    }
}
