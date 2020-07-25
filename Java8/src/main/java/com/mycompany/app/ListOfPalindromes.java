package com.mycompany.app;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ListOfPalindromes {
    public List<String> typeCalculate(List<String> a){
        Stream<String> result = a.stream().filter(x -> ( x.startsWith("a") && x.length()==3 ));
        return  result.collect(Collectors.toList());
    }
}