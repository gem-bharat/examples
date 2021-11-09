package com.Test.optional;

import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor
public class Optionalobj {
    public void nonOptional() {
        String[] stringWords = new String[10];
        String word = stringWords[5].toLowerCase();
        System.out.print(word);
    }
    public void optionalFUnctionality()
    {
        String[] words = new String[10];
        Optional<String> checkNull =
                Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        } else
            System.out.println("word is null");

        String[] str = new String[5];
        str[2] = "Geeks Classes are coming soon";

        Optional<String> value = Optional.of(str[2]);

        System.out.println(value.get());

        System.out.println(value.hashCode());

        System.out.println(value.isPresent());
    }

}

