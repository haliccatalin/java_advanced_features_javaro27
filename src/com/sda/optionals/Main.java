package com.sda.optionals;

import java.util.Optional;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // value = "Andrei", ce pasam in Optional.of () sau Optional.ofNullable() reprezinta value

        // nu permite ca valoarea sa fie null
        Optional<String> stringOptional = Optional.of("Andrei");

        // permite ca valoarea sa fie null
//        Optional<String> stringOptional = Optional.ofNullable(null);

        // .get() => ne ajuta sa accesam valoarea dintr-un optional
        String result = stringOptional.get();
        System.out.println("get() => " + result);

        // .isPresent() <=> if(value != null) => este echivalentul unui if, returneaza true / false;
        boolean result2 = stringOptional.isPresent();
        System.out.println("isPresent() => " + result2);

        // .ifPresent() <=> if(value != null) { sout("Valoarea este prezenta); } -> este echivalentul lui if si primul block de cod
        // daca e prezent atunci executa lambda
        stringOptional.ifPresent((String value) -> System.out.println("ifPresent() => Valoarea este prezenta"));
//                        linia 26 este echivalentul liniilor 29 - 34;

        stringOptional.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println("ifPresent() => Valoarea este prezenta");
            }
        });

        // .ifPresentOrElse() <=> if(value != null) { sout("valoarea este prezenta); } else { sout("valoarea este null"); }
        // primul parametru este pentru valoarea adevarata a lui if, iar al doilea pentru valoarea falsa a lui if
        // daca e prezent executa lambda, atlfel executa else
        stringOptional.ifPresentOrElse(
                (value) -> System.out.println("ifPresent() => Valoarea este prezenta"), // valoarea true a lui if
                () -> System.out.println("orElse() => valoareae este null") // valoarea false a lui if
        );



    }

    public static Optional<String> getAllNamesFromDatabase() {
        return Optional.of("Catalin");
    }
}
