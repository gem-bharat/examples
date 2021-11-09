package com.Test.lambda;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

interface Addable{
    int add(int a,int b);
}

@NoArgsConstructor
public class LambdaDemo {
    public void lambdaExample(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        Addable addition=(a,b) -> {return a+b;
        };
        System.out.println(addition.add(1,2));
    }

}
