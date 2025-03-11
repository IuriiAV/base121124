package com.telran.prof.lessoons.lesson17;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fruit {

    private String title;

    private int price;

    private Category category;
}
