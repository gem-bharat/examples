package com.Test.iterators;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class IteratorClass {
    public void listIterator(){
        List list = new ArrayList();

        list.add("123");
        list.add("456");
        list.add("789");
        java.util.Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            //printing iterator next values
            System.out.println(iterator.next());
            //try to modify during iteration
            if(iterator.next().equals("456")){
                try {
                    list.add("999");
                }
                catch (Exception exception){
                    System.out.println(exception.getMessage());
                }
            }
            //remove during iteration
            if(iterator.next().equals("789")){
                iterator.remove();
            }

        }
        //using forEachRemaining in iterators
        iterator.forEachRemaining(element->{
            System.out.println(element);
        });

    }
}
