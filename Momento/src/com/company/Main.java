package com.company;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("Hello World 1 ");
        history.push(editor.getState());

        editor.setContent("Hello World 2 ");
        history.push(editor.getState());

        editor.setContent("Hello World 3 ");
        history.push(editor.getState());

        editor.restore(history.pop());
//        editor.restore(history.pop());
//        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
