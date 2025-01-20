package com.telran.prof.lessons.lesson4;

/**
 * LittlePony -> Pony -> Horse
 *
 * Horse -> jump(h), walk(h)
 * Pony -> jump(p), walk(h)
 * LittlePony -> jump(), walk(h)
 *
 * Полиморфизм - это работа со множеством различных объектов
 * через их общие интерфейсы, без знания о типе конкретного объекта
 *
 * Переопределение (Override) - это частный случай полиморфизма
 *
 * Конкретный метод, который будет выполнен объекта, определяется во время выполнения программы
 *
 *
 * Перегрузка (Overload) - это частный случай полиморфизма, основан на наличии
 * нескольких методов с одинаковыми именами в одном классе,
 * но различной сигнатурой(сигнатура имя метода плюс параметры),
 * может быть разное количество параметров, разный их тип или разный порядок
 *
 * Определение метода, который будет вызван, произходит во время компиляции приложения
 */
public class AnimalApp {

    public static void main(String[] args) {
        Horse smallHorse = new Horse();
        Pony pony = new Pony();
        LittlePony littlePony = new LittlePony();

        Horse[] horses = {smallHorse, pony, littlePony};
        for (Horse horse : horses) {
            horse.jump(); //1.Horse,2.Pony,3.LittlePony
        }
    }
    // jump, walk
    //horse -> jump(h), walk(h)
    //pony -> jump(p) -> horse -> walk(h)
    //littlePony -> jump(p), ->Pony->Horse-> walk(h)
}
