package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAdvance {

    public static void main(String[] args) {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0, Arrays.asList("Buenos Aires", "Córdoba", "La Plata")),
                new Employee(2, "Bill Gates", 200000.0, Arrays.asList("Buenos Aires1", "Córdoba1", "La Plata1")),
                new Employee(3, "Bill Gates", 300000.0, Arrays.asList("Buenos Aires2", "Córdoba2", "La Plata2")),
                new Employee(4, "Bill 3 Gates", 400000.0, Arrays.asList("Buenos Aires3", "Córdoba3", "La Plata3")),
                new Employee(5, "Bill 3 Gates", 500000.0, Arrays.asList("Buenos Aires4", "Córdoba4", "La Plata4")),
                new Employee(6, "Bill 5 Gates", 600000.0, Arrays.asList("Buenos Aires5", "Córdoba5", "La Plata5")),
                new Employee(7, "Mark Zuckerberg", 700000.0, Arrays.asList("Buenos Aires6", "Córdoba6", "La Plata6"))
        };

        Map<String,Employee> empMap=Arrays.stream(arrayOfEmps).collect(Collectors.toMap(e->e.getName(), Function.identity(),(e1, e2)->e1));
        Map<String, String> empAddressMap = empMap.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> String.join(",", e.getValue().getAddress())
                ));

        System.out.println(empAddressMap);

        Map<String, String> empAddressMap1 = Arrays.stream(arrayOfEmps)
                .collect(Collectors.toMap(
                        Employee::getName,
                        e -> String.join(",", e.getAddress()),
                        (e1, e2) -> e1
                ));
        System.out.println(empAddressMap);


    }
}
