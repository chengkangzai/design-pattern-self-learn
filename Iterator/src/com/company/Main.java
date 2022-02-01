package com.company;

public class Main {

    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("https://www.google.com");
        history.push("https://www.facebook.com");
        history.push("https://www.youtube.com");

        //This is not good, as if we change List to other type, we will have to change all the code
//        for (int i = 0; i < history.getUrls().size(); i++) {
//            var url = history.getUrls().get(i);
//            System.out.println(url);
//        }

        //This is better, as the code will not effect if we change List to other type
        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

    }
}
