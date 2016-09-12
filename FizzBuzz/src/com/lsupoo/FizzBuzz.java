package com.lsupoo;

import java.util.List;
import java.util.ArrayList;
public class FizzBuzz {

    private int fizzData;
    private int buzzData;
    private int qtyData;
    private ArrayList<Integer> nums;

    public FizzBuzz(int fizzData, int buzzData, int qtyData) {
        this.fizzData = fizzData;
        this.buzzData = buzzData;
        this.qtyData = qtyData;
    }

    public List<Integer> result() {
	    // write your code here
        nums= new ArrayList<>();
        for(int i = 1 ; i <= this.qtyData; ++i){
            if(i % (fizzData*buzzData)== 0){
                nums.add(i);
            }else if(i % fizzData == 0){
                nums.add(i);
            }else if(i % buzzData == 0){
                nums.add(i);
            }
        }
        return nums;
    }
}
