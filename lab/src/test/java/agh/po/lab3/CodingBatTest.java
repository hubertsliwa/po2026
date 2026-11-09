package agh.po.lab3;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class CodingBatTest {

    @org.junit.Test
    public void hasTeen() {
        assertEquals(true, CodingBat.hasTeen(13, 20, 10));
        assertEquals(true, CodingBat.hasTeen(20, 19, 10));
        assertEquals(true, CodingBat.hasTeen(20, 10, 13));
    }

    @org.junit.Test
    public void loneTeen() {
        assertEquals(true, CodingBat.loneTeen(13, 99));
        assertEquals(true, CodingBat.loneTeen(21, 19));
        assertEquals(false, CodingBat.loneTeen(13, 13));
    }

    @org.junit.Test
    public void countEvens() {
        assertEquals(3, CodingBat.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, CodingBat.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, CodingBat.countEvens(new int[]{1, 3, 5}));
    }

    @org.junit.Test
    public void makeAbba() {
        assertEquals("HiByeByeHi", CodingBat.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", CodingBat.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", CodingBat.makeAbba("What", "Up"));
    }

    @org.junit.Test
    public void mapAB() {
        CodingBat c= new CodingBat();
        assertEquals(Map.of("a", "Hi", "b", "There", "ab", "HiThere"), c.mapAB(new HashMap<>(Map.of("a", "Hi", "b", "There"))));
        assertEquals(Map.of("a", "Hi"), c.mapAB(new HashMap<>(Map.of("a", "Hi"))));
        assertEquals(Map.of("b", "There"), c.mapAB(new HashMap<>(Map.of("b", "There"))));
    }

    @org.junit.Test
    public void wordLen() {
        assertEquals(Map.of("a", 1, "bb", 2), CodingBat.wordLen(new String[]{"a", "bb", "a", "bb"}));
        assertEquals(Map.of("this", 4, "and", 3, "that", 4), CodingBat.wordLen(new String[]{"this", "and", "that", "and"}));
        assertEquals(Map.of("code", 4, "bug", 3), CodingBat.wordLen(new String[]{"code", "code", "code", "bug"}));
    }
}