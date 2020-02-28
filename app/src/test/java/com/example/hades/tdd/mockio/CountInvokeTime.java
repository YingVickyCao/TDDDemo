package com.example.hades.tdd.mockio;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class CountInvokeTime {
    @Test
    public void countMethodInvokeTime() {

        // mock creation
        List<String> data = Mockito.mock(List.class);

        data.add("a");
        data.add("b");
        data.add("b");

        Mockito.verify(data, Mockito.times(1)).add("a");
        Mockito.verify(data, Mockito.times(2)).add("b");

        Mockito.verify(data, Mockito.never()).clear();

        Mockito.verify(data, Mockito.atMost(1)).add("a");
        Mockito.verify(data, Mockito.atMost(2)).add("b");

        Mockito.verify(data, Mockito.atLeastOnce()).add("a");
        Mockito.verify(data, Mockito.atLeast(1)).add("a");
    }
}
