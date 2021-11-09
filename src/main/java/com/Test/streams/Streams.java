package com.Test.streams;

import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor
public class Streams {
    public void streamUsage(){

        List<Integer> number = Arrays.asList(2,3,4,5);

        //  map method
        List<Integer> square = number.stream().map(x -> x*x).
                collect(Collectors.toList());
        System.out.println(square);

        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");

        // filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);

        // sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        List<Integer> numbers = Arrays.asList(2,3,4,5,2);

        // method to returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println(y));

        // reduce method
        int even =
                number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);
    }
}
