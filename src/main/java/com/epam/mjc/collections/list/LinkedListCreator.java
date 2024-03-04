package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer a : sourceList) {
            if (a%2==0){
                linkedList.addLast(a);
            }
            else{
                linkedList.addFirst(a);
            }
        }
        return linkedList;
    }
}
