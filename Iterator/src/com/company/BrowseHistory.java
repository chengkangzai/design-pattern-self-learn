package com.company;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    /**
     * Hey, try to change this from List to String[], Main will not even notice anything changed.
     */
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        return urls.remove(urls.size() - 1);
    }

//    public List<String> getUrls() {
//        return urls;
//    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {
        private BrowseHistory browseHistory;
        private int index;

        public ListIterator(BrowseHistory browseHistory) {
            this.browseHistory = browseHistory;
        }

        @Override
        public boolean hasNext() {
            return index < browseHistory.urls.size();
        }

        @Override
        public String current() {
            return browseHistory.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
