package com.telran.prof.lessontwo;

/**
 * Будет создан класс SmallDog и у него будут все методы из
 * класса Dog, так, как будто они написаны в классе SmallDog
 *
 * Dog - суперкласс, класс родитель, базовый класс
 *
 * SmallDog - наследник, подкласс, дочерний класс, производный класс, расширенный
 *
 * 1) Наследовать можно только один класс, множественное наследование запрещено!
 * 2) Наследуется(те доступно для наследника) все, кроме приватных переменных и методов
 * 3) Запретить наследование, если у родителя в сигнатуре класса поставить final
 * 4) При наследовании, мы можем добавлять новый функционал, в класс наследник,
 * расширяя поведение класса родителя
 * 5) При наследовании, мы можем изменить поведение уже существующего метода родительского
 * класса - переопределить!!! Или же дополнить уже существующее поведение одного и того же
 * метода
 *
 * Наследники - знают все о родителях, родители - не представляют, что у них есть наследники

 */
public class SmallDog extends Dog {

    public void jump() {
        System.out.println("Small dog jump");
    }
}
