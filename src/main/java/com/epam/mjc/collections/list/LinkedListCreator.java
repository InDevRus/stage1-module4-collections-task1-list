package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        var result = new LinkedList<Integer>();
        for (var number : sourceList) {
            if (number % 2 == 0) {
                result.addLast(number);
            } else {
                result.addFirst(number);
            }
        }
        return result;
    }
}
