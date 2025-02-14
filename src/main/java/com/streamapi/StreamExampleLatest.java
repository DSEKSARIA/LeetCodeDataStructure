package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExampleLatest {


    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            myList.add(i);

        List<Integer> intList = List.of(15, 20, 48, 63, 49, 27, 56, 32, 9, 15, 20, 48, 63, 49, 27, 56, 32, 9);


        List<List<Integer>> number = new ArrayList<>();

        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));

        System.out.println("List of list-" + number);

        intermediatryFunctions(intList, number);

        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Bill 2 Gates", 300000.0),
                new Employee(4, "Bill 3 Gates", 400000.0),
                new Employee(5, "Bill 4 Gates", 500000.0),
                new Employee(6, "Bill 5 Gates", 600000.0),
                new Employee(7, "Mark Zuckerberg", 700000.0)
        };

        int[] searchIds = new int[]{1, 3, 6};
        //ArrayList<Integer> searchid=Arrays.asList(searchIds);//Arrays.stream(searchIds).map(i->Integer.valueOf(i)).collect(Collectors.toList());

        terminalFunctions(arrayOfEmps, searchIds);

    }

    public static void intermediatryFunctions(List<Integer> intList, List<List<Integer>> numbers) {
        interFilterFunction(intList);
        interSortedFunction(intList);
        interDistinctFunction(intList);
        interMapFunction(intList);
        interFlatMapFunction(numbers);
        interPeekFunction(numbers);
    }

    public static void interMapFunction(List<Integer> intList) {
        System.out.println();
        System.out.println("Function for Map");
        intList.stream().distinct().map(i -> i * i * i).forEach(i -> System.out.print(" " + i + " "));
    }

    public static void interFilterFunction(List<Integer> intList) {
        System.out.println();
        System.out.println("Function for Filter");
        intList.stream().filter(i -> (i % 2 == 0)).forEach(i -> System.out.print(" " + i + " "));
    }

    public static void interSortedFunction(List<Integer> intList) {
        System.out.println();
        System.out.println("Function for Sorted");
        intList.stream().sorted().forEach(i -> System.out.print(" " + i + " "));
    }

    public static void interFlatMapFunction(List<List<Integer>> intList) {
        System.out.println();
        System.out.println("Function for FlatMap");
        intList.stream().flatMap(List::stream).sorted().forEach(i -> System.out.print(" " + i + " "));
        System.out.println();
        System.out.println("Function for FlatMap");
        intList.stream().flatMap(s -> s.stream()).sorted().forEach(i -> System.out.print(" " + i + " "));

    }

    public static void interDistinctFunction(List<Integer> intList) {
        System.out.println();
        System.out.println("Function for Distinct");
        intList.stream().distinct().forEach(i -> System.out.print(" " + i + " "));
    }

    public static void interPeekFunction(List<List<Integer>> numbers) {
        System.out.println();
        System.out.println("Function for Peek");
        List<Integer> flatMapList = new ArrayList<>();
        numbers.stream().flatMap(List::stream).peek(s -> flatMapList.add(s)).sorted().filter(s -> s % 2 != 0).forEach(i -> System.out.print(" " + i + " "));
        System.out.println();
        System.out.println("Debug for FlatMap");
        flatMapList.stream().forEach(s -> System.out.print(" " + s + " "));

    }

    public static void terminalFunctions(Employee[] arrayOfEmps, int[] searchIds) {
        termForEachFunctions(arrayOfEmps);
        termCollectFunctions(arrayOfEmps, searchIds);
        termFindFirstFunctions(arrayOfEmps,1);
    }

    public static void termCollectFunctions(Employee[] arrayOfEmps, int[] searchIds) {
        System.out.println();
        System.out.println("Function for Collect");
        List<Integer> as = Arrays.stream(searchIds).boxed().collect(Collectors.toList());
        //List<Integer> ne=new ArrayList<>(Arrays.stream(searchIds));
        List<Integer> idList = new ArrayList<>();
        idList.add(1);
        idList.add(7);
        //Map<Integer, Employee> ids = Arrays.stream(arrayOfEmps).filter(e -> idList.contains(e.getId())).collect(Collectors.toMap(Employee::getId, e -> e));
        Map<Integer, List<Employee>> ids = Arrays.stream(arrayOfEmps).filter(e -> idList.contains(e.getId())).collect(Collectors.groupingBy(Employee::getId));
        System.out.println(ids.entrySet().stream().count());
        ids.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList()).stream().forEach(System.out::println);
    }

    public static void termForEachFunctions(Employee[] arrayOfEmps) {
        System.out.println();
        System.out.println("Function for ForEach");
        Arrays.stream(arrayOfEmps).forEach(emp -> System.out.println(emp));
    }

    public static void termReduceFunctions(Employee[] arrayOfEmps) {
    }

    public static long termCountFunctions(Employee[] arrayOfEmps) {
        return Arrays.stream(arrayOfEmps).count();
    }

    public static void termFindFirstFunctions(Employee[] arrayOfEmps,int x) {
        System.out.println(Arrays.stream(arrayOfEmps).filter(e->e.getId()==x).findFirst());
    }

    public static void termAllMatchFunctions(Employee[] arrayOfEmps) {
    }

    public static void termAnyMatchFunctions(Employee[] arrayOfEmps) {
    }


}