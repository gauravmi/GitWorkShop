package com.thoughtworks.demo;

import java.util.ArrayList;
import java.util.List;

public class ListExperiment {

    List<Object> list;
    public ListExperiment(int size) {
        list=new ArrayList<Object>(size);
    }

    public void add(Object o){
         list.add(o);
    }
    public int length(){
        return list.size();
    }
}
