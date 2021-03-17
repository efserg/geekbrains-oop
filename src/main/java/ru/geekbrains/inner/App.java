package ru.geekbrains.inner;

public class App {
    public static void main(String[] args) {
        Reader anonymousReader = new Reader() { // анонимный класс
            @Override
            public String read() {
                return "Читаем из анонимного класса";
            }
        };

        // начиная с Java 8 анонимный класс с одним методом может быть преобразован в лямбду
        Reader lambdaReader = () -> "Читаем из анонимного класса";

        Outer.Inner outer = new Outer().new Inner();
        Outer.StaticInner staticInner =
                new Outer.StaticInner();
    }
}
