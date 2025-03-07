package com.telran.prof.lessons.lessons16;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Stream - поток данных
 * .stream() - создание потока данных в любой коллекции(и массива тоже)
 *
 * Стрим делится на два типа операций:
 * Промежуточный (Intermediate) - операции, которые после себя возвращают тоже стрим
 * их может быть много и они идут друг за другом, но они не дают конечного результата
 *
 *
 * Конечный(Terminal) - операции которые завершают стрим и выполняют его и возвращаю его нам
 * результат, такая операция может быть только одна у стрима
 *
 * collection.stream().Intermediate.Intermediate.Intermediate....Intermediate.Terminal
 *
 * Любые операции в стриме не меняют количество и порядок элементов оригинальной коллекции
 *
 * Intermediate:
 * filter(predicate) - filter elements of stream
 * list.stream() -> <data stream> -> filter(predicate) -> <data stream> ...
 * sorted() - sort stream
 * skip() - skip elements
 * limit() - limit elements
 * distinct() - unique elements
 * peek(Consumer) - make action with every element
 * map(Function) - convert type of element
 * flatmap(Function) - work with stream
 *
 * Terminal:
 * count() - count of element in stream
 * collect() - collect elements to new Collections, String ... etc
 * foreach(Consumer)
 */

public class StreamApiExampleTwo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "20", "2", "1", "15", "10", "30", "20");

        // count element starts with 2
        int count = 0;
        for(String s : list){
            if(s.startsWith("2")){
                count++;
            }
        }
        System.out.println(count);

        //count() , filter(Predicate)
        Predicate<String> startByTwo = s -> s.startsWith("2");
        System.out.println("30 start with 2 " + startByTwo.test("26"));

        long count1 = list.stream().filter(startByTwo).count();
        System.out.println(count1);
        long count2 = list.stream().filter(s -> s.startsWith("2")).count();
        System.out.println(count2);

        long count3 = list.stream().filter(s -> s.equals("10")).count();
        System.out.println(count3);


        List<String> listTwo = new ArrayList<>();
        for(String s : list){
            if(s.startsWith("1")){
                listTwo.add(s);
            }
        }
        System.out.println(listTwo);

        List<String> collect = list.stream()
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(collect);

        //sorted()
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        // skip, limit
        System.out.println("Skip : " + list);
        List<String> skippedList = list.stream().skip(3).collect(Collectors.toList());
        System.out.println(skippedList);

        System.out.println("Limit : " + list);
        List<String> limited = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(limited);

        //distinct

        Set<String> distinctList = new HashSet<>();
        for (String s : list) {
            distinctList.add(s);
        }
        System.out.println(distinctList + "\n");

        List<String> distinctListTwo = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctListTwo);

        //peek
        Consumer<String> stringConsumer = s -> System.out.print(s + "+");
        List<String> sortedListTwo = list.stream()
                .peek(stringConsumer)
                .sorted()
                .peek(stringConsumer)
                .collect(Collectors.toList());
        System.out.println("\n" + sortedListTwo + "\n");


        //foreach
        list.stream()
                .sorted()
                .forEach(s -> System.out.print("_" + s));


    }
}
