package com.mycompany.app;
import java.util.List;
class ListAverage {
    public double avgCalculate(List<Integer> lst){
        return (float) lst.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }
}