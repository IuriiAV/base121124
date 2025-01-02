Если у нас есть статический метод (print()) в классе PrintExample  :
Если метод main , находится в этом классе и мы из него вызываем
наш статический метод , то просто вызываем по имени print()

public class PrintExample {

    public static void main(String[] args) {
          print();
    }

    public static void print() {

    }
}

Если мы хотим этот метод вызвать из другого класса , то тогда вызваем через имя
класса, в котором этот метод находится

public class App {

    public static void main(String[] args) {
          PrintExample.print();
    }
}


Если метод print() не статический, то тогда , если мы вызываем его из
метода main!!! внутри этого класса или из другого метода другого класса,
то тогда нужно создать объект и вызвать метод у объекта

public class PrintExample {

    public static void main(String[] args) {
          PrintExample printExample = new PrintExample();
          printExample.print();
    }

    public void print() {

    }
}

public class App {

    public static void main(String[] args) {
          PrintExample printExample = new PrintExample();
          printExample.print();
    }
}

public class PrintExampleTest {

    @Test
    public void testPrint() {
          PrintExample printExample = new PrintExample();
          printExample.print();
    }
}

Если не статический метод вызывается из другого не статического метода одного
и того же класса, то тогда можно просто вызывать его по имени

public class PrintExample {

    public void checkPrint() {
           print();
    }

    public void print() {

    }
}
