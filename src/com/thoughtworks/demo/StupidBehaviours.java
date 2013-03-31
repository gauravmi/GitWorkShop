package com.thoughtworks.demo;

import java.util.ArrayList;
import java.util.List;

public class StupidBehaviours {

    List<Object> list;
    public StupidBehaviours(int size) {
        list=new ArrayList<Object>(size);
    }

    public void add(Object o){
         list.add(o);
    }
    public int length(){
        return list.size();
    }

    public String smile(){
        System.out.println("why are you smiling..");
        return "why are you smiling..";
    }
}
