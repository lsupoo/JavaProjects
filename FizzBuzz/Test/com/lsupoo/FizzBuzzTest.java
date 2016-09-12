package com.lsupoo;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lsupo on 12/09/2016.
 */
public class FizzBuzzTest {
//    @Before
//    public void setUp() throws Exception {
//
//    }

    @Test
    public void TestEquals() throws Exception {
        //arrange
        FizzBuzz fb1= new FizzBuzz(4,5,20);
        //act
        List<Integer> array = fb1.result();
        //assert
        int[] expectedArray = {4,5,8,10,12,15,16,20};
        int [] actualArray = array.stream().
                mapToInt(n->n).toArray();
        System.out.println(expectedArray);
        System.out.println(actualArray);
        assertArrayEquals(expectedArray,actualArray);
    }
    @Test
    public void TestNotEquals() throws Exception {
        //arrange
        FizzBuzz fb1= new FizzBuzz(4,5,19);
        //act
        List<Integer> array = fb1.result();
        //assert
        int[] expectedArray = {4,5,8,10,12,15,16,20};
        int [] actualArray = array.stream().
                mapToInt(n->n).toArray();
        System.out.println(expectedArray);
        System.out.println(actualArray);
        assertArrayEquals(expectedArray,actualArray);
    }
    @Test
    public void TestSize() throws Exception {
        //arrange
        FizzBuzz fb1= new FizzBuzz(4,5,20);
        //act
        List<Integer> array = fb1.result();
        //assert
        assertEquals(array.size(),8);
    }

//    @After
//    public void tearDown() throws Exception {
//
//    }

}