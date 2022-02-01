package com.company;

public class BrushTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("BrushTool mouseDown");
    }

    @Override
    public void mouseUp() {
        System.out.println("BrushTool mouseUp");
    }
}
