package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    private int keyFunction(int x) {
        return 5 * x * x + 3;
    }

    @Override
    public int compare(String a, String b) {
        var difference = keyFunction(Integer.parseInt(a)) - keyFunction(Integer.parseInt(b));
        return difference != 0 ? difference : a.compareTo(b);
    }
}
