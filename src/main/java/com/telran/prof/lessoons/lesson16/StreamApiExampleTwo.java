package com.telran.prof.lessoons.lesson16;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream - поток данных
 * .stream() - создание потока данных у любой коллекции(и массива тоже)
 *
 * Стрим делится на два вида операций:
 * Промежуточный(Intermediate) - операции, которые после себя возвращают тоже стрим
 * их может быть много и они идут друг за другом, но они не дают конечного результата
 *
 * Конечные(Terminal) - операции которые завершают стрим и выполняют его и возвращают нам
 * результат, такая операция может быть только одна у стрима
 *
 * collections.stream().Intermediate.Intermediate.Intermediate....Intermediate.Terminal

 *
 * Любые операции в стриме не меняют количество и порядок элементов в оригинальной коллекции
 *
 * Intermediate:
 * filter(predicate) - filter elements of stream
 * list.stream()-><data stream>->filter(predicate)-><data steam>...
 * sorted() - sort stream
 * skip() - skip elements
 * limit() - limit elements
 * distinct() - unique elements
 * peek(Consumer) - make action with every element
 * map(Function) - convert type of element
 * flatmap(Function) - work with stream
 *
 * Terminal:
 * count() - count of elements in stream
 * collect() - collect elements to new Collection, String...etc
 * foreach(Consumer) - make action with every element
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

        //count(), filter(predicate)
        Predicate<String> startByTwo = s -> s.startsWith("2");
        System.out.println("30 start with 2 " + startByTwo.test("30"));

        long count1 = list.stream().filter(startByTwo).count();
        System.out.println(count1);
        long count2 = list.stream().filter(s -> s.startsWith("2")).count();
        System.out.println(count2);

        long count3 = list.stream().filter(s -> s.equals("10")).count();
        System.out.println(count3);

        List<String> stringList = new ArrayList<>();

        for (String string : list) {
            if(string.startsWith("1")){
                stringList.add(string);
            }
        }
        System.out.println(stringList);

        //collect()
        List<String> collect = list.stream()
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(collect);

        //sorted()
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        //skip, limit
        System.out.println("Skip : " + list);
        List<String> skippedList = list.stream().skip(3).collect(Collectors.toList());
        System.out.println(skippedList);

        System.out.println("Limit : " + list);
        List<String> limited = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(limited);

        //distinct
        List<String> collect1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect1);

        List<String> strings = new ArrayList<>();
        for (String s : list) {
            if (!strings.contains(s)) {
                strings.add(s);
            }
        }
        System.out.println(strings);

        Set<String> stringSet = new HashSet<>(list);
        System.out.println(stringSet);

        //peek
        Consumer<String> stringConsumer = s -> System.out.print(s + "+");
        List<String> sortedList2 = list.stream()
                .peek(stringConsumer)
                .sorted()
                .peek(stringConsumer)
                .collect(Collectors.toList());

        System.out.println();

        list.stream()
                .sorted()
                .forEach(s -> System.out.print("_" + s));
    }
}
