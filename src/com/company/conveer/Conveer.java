package com.company.conveer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by USER on 25.01.2016.
 */
public class Conveer {
    private List<Integer> list = new LinkedList<>();

    public void add(Integer integer){
        System.out.println("add");
        list.add(integer);
            }

    public Integer remove(){
        System.out.println("remove");
        return list.remove(0);
    }

    public int getSize(){
        return list.size();
    }
}
