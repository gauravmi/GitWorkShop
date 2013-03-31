package com.thoughtworks.demo;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertThat;

public class ListExperimentTest {
         StupidBehaviours stupidBehaviours =new StupidBehaviours(5);

    @Test
    public void shouldAddElement(){
        stupidBehaviours.add("anil");
        assertTrue(stupidBehaviours.length()==1);
    }
    @Test
    public void shouldSayWhyAreYouSmiling(){
        StupidBehaviours man = new StupidBehaviours(1);
        String expected= "why are you smiling..";
        assertThat(man.smile(), IsEqual.equalTo(expected));
    }

    @Test
    public void shouldAddTwoElement(){
        stupidBehaviours.add("anil");
        stupidBehaviours.add("kumar");
        assertTrue(stupidBehaviours.length()==2);
    }


}
