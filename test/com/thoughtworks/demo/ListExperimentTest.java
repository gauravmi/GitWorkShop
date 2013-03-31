package com.thoughtworks.demo;

import com.sun.corba.se.impl.orb.ParserTable;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class ListExperimentTest {
         ListExperiment listExperiment=new ListExperiment(5);

    @Test
    public void shouldAddElement(){
        listExperiment.add("anil");
        assertTrue(listExperiment.length()==1);
    }

}
