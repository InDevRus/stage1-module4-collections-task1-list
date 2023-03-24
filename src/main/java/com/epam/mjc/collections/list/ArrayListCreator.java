package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        var result = new ArrayList<String>();
        for (var index = 2; index < sourceList.size(); index += 3) {
            var word = sourceList.get(index);
            result.add(word);
            result.add(word);
        }
        return result;
    }
}
